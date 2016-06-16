public class Solution {
    public int missingNumber(int[] nums) {
        //if (nums.length == 1)   return 0;
        int length = nums.length;
        int execption = length * (length+1) / 2;
        int real = 0;
        for (int i:nums){
            real +=i;
        }
        return execption - real;
    }
}