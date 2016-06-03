public class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
    for (int n : nums)
        if (i == 0 || n > nums[i-1])
            nums[i++] = n;
            System.out.println(i);
    return i;
    }
}