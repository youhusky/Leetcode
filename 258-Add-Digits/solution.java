// in  out  in  out
// 0   0    10  1
// 1   1    11  2
// 2   2    12  3
// 3   3    13  4
// 4   4    14  5
// 5   5    15  6
// 6   6    16  7
// 7   7    17  8
// 8   8    18  9
// 9   9    19  1
public class Solution {
    public int addDigits(int num) {
        //out = (in - 1) % 9 + 1
        if (num == 0){
            return 0;
        }
        else{
            return (num -1) % 9 + 1;
        }
    }
}