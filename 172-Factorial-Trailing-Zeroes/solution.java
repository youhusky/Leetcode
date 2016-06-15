//count 5
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
// Iterative
// public class Solution {
//     public int trailingZeroes(int n) {
//         if (n < 0) {
//             return -1;
//         }

//         int count = 0;
//         for (; n > 0; n /= 5) {
//             count += (n / 5);
//         }

//         return count;
//     }
// }