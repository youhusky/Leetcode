public class Solution {
    public String largestNumber(int[] num) {
        StringBuilder res = new StringBuilder();
		if (num == null || num.length == 0)
            return null;
        
        //conver Integer to string
        String[] nums = new String[num.length];
        for (int i = 0; i < num.length; i++)
            nums[i] = Integer.toString(num[i]);
            
        //Define comparator
        Comparator<String> comp = new Comparator<String>()
                {
                    @Override
                    public int compare(String o1, String o2)
                    {
                    	return (o1+o2).compareTo(o2+o1);
                    }
                };
         Arrays.sort(nums, comp);
         
         //The new number should not start with 0 unless it is 0
        if (nums[nums.length-1].equals("0")) 
            return "0";
       
        for (int i = nums.length-1; i >= 0; i--)
         {
        	 res.append(nums[i]);
         }
        
        return res.toString();
    }
}