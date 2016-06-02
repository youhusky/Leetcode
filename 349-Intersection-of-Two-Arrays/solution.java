public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> inter = new HashSet<>();
        for (int i= 0;i < nums1.length;i++)
            set.add(nums1[i]);
        for (int i = 0;i<nums2.length;i++)
            {
            if (set.contains(nums2[i]))
            inter.add(nums2[i]);
            }
      
        int[] result = new int[inter.size()];
        int count = 0;
        // output
        for(Integer i : inter)
            result[count++] = i;
        //for each
        return result;
    }
}