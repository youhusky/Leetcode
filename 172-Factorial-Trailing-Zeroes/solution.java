public class Solution {
    public int trailingZeroes(int n) {
       //recursive method
       if (n == 0)  return 0;
       else if (n < 0)  return -1;
       else{
           return n / 5 + trailingZeroes(n / 5);
       }
    }
}