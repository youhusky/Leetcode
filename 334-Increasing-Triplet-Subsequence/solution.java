public class Solution {
    public boolean increasingTriplet(int[] nums) {
       int x1 = Integer.MAX_VALUE, x2 = Integer.MAX_VALUE;
        for(int num : nums){
            if(num <= x1) x1 = num;
            else if(num <=x2) x2 = num;
            else return true;
        }
        return false;
    }
}