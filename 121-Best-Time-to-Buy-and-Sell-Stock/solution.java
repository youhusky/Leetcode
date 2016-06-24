public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1){
            return 0;
        }
        int minPrice = prices[0];
        int res = 0;
        for (int i = 1; i < prices.length; i++){
            if (minPrice > prices[i]){
                minPrice = prices[i];
            }
            else{
                res = Math.max(res, prices[i] - minPrice);
            }
        }
        return res;
    }
}