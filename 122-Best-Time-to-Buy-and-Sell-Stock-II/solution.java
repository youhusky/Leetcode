public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1){
            return 0;
        }
        int res = 0;
        int minPrice = prices[0];
        for (int i = 1; i< prices.length;i++){
            if (prices[i] > minPrice){
                res += prices[i] - minPrice;
            }
                minPrice = prices[i];
        }
        return res;
    }
}