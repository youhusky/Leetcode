public class Solution {
    public int maxProfit(int k, int[] prices) {
        if (prices.length <2){
            return 0;
        }
        else if (k > prices.length /2){//II
            int max = 0;
            for (int i = 1; i< prices.length; i++){
                if(prices[i] > prices[i-1])
                    max += prices[i] - prices[i-1];
            }
            return max;
        }
        int[] local = new int[k+1];
        int[] global = new int[k+1];
            for (int day = 1; day < prices.length; day++){
                int diff = prices[day] - prices[day-1];
                for (int times = k; times>=1; times--){
                    local[times] = Math.max(global[times-1] + (diff>0?diff:0), local[times] + diff);// can purchase and sell on the same day
                    global[times] = Math.max(global[times],local[times]);
                }
            }
        
        return global[k];
    }
}