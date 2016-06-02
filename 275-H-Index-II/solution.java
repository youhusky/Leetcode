public class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
    int lo = 0, hi = citations.length-1;

    while ( lo <= hi) {
        int mid = lo + (hi-lo)/2;
        if(citations[len-mid-1] > mid) {
            lo = mid + 1;
        } else {
            hi = mid - 1;
        }

    }
    return lo;}
}