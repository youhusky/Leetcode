public class Solution {
    public int mySqrt(int x) {
        if (x <=1)  return x;
        int left = 1, right = x;
        int mid = (x-1) / 2;
        if (mid == 0) return 1;
        while (left <= right){
            if (mid <= x/ mid){// 多算一次
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
             mid = (right - left) / 2 + left;
        }
        return mid - 1;
    }
}