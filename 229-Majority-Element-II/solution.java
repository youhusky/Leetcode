public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList();
        if (nums.length == 0) return res;
        int count1 = 1, count2 = 0, number1 = nums[0], number2 = 0;
        for(int i = 1; i < nums.length;i++){
            if (nums[i] == number1){
                count1++;
            }
            else if (nums[i] == number2){
                count2++;
            }
            else if (count1 != 0 && count2 != 0){
                count1--;
                count2--;
            }
            else{
                if(count1 == 0){
                    number1 = nums[i];
                    count1 = 1;
                }
                else{
                    number2 = nums[i];
                    count2 = 1;
                }
            }
            
        }
        count1 = 0; count2 = 0;
        for(int i:nums){
            if(i == number1)
                count1++;
            else if(i == number2)
                count2++;
        }
        //System.out.println(count1);
        if (count1 > nums.length/3)
        res.add(number1);
        if(count2 > nums.length/3)
        res.add(number2);
        return res;
    }
}