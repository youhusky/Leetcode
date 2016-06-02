public class Solution {
    public int hIndex(int[] citations) {
        if (citations == null)
            return 0;
        int h = 0;
        Arrays.sort(citations);
        int length = citations.length;
        for (int i = length - 1; i >=0 && (citations[i] >= length-i);--i)//[1] i==0
             h = length - i;
        return h;
    }
}