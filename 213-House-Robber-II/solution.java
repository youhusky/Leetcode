public class Solution {
    public int rob(int[] nums) {
       if(nums == null || nums.length == 0){
           return 0;
       } 
       else if (nums.length == 1){
           return nums[0];
       }
       else{
           int n = nums.length;
           return Math.max(helper(nums,0,n-2),helper(nums,1,n-1));
       }
    }
    private int helper(int[] num, int start, int end){
            int[] dp = new int [end-start+1];
            dp[0] = num[start];
            if (end==start){
                return dp[0];
            }
            dp[1] = Math.max(dp[0],num[start+1]);
            for (int i = 2;  i<= end - start; i++){
                System.out.println(num[i]);
                dp[i] = Math.max(num[start+i] + dp[i-2],dp[i-1]);
            }
            
        return dp[end-start];
    }
}