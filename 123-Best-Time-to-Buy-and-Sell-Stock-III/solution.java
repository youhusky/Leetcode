public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1){
            return 0;
        }
        int max = 0;
        int[] left = new int [prices.length];
        int[] right = new int [prices.length];
        
        process(prices, left, right);
        
        for (int k = 0; k < prices.length; k++){
            max = Math.max(max, right[k] + left[k]);
        }
        return max;
    }
    private void process(int[] price, int[] left, int[] right){
        left[0] = 0;
        int min = price[0];
        
        for (int i = 1; i < price.length; i++){
            left[i] = Math.max(left[i - 1], price[i] - min);
            min = Math.min(min, price[i]);
        }
        
        right[price.length-1] = 0;
        int max = price[price.length-1];
        
        for (int j = price.length-2; j>= 0; j--){
            right[j] = Math.max(right[j + 1], max - price[j]);
            max = Math.max(max, price[j]);
        }
    }
}