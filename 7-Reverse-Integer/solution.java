public class Solution {
    public int reverse(int x) {
        long temp = 0;
        // use long to check overflow
        while (x != 0){
            temp = temp * 10; //123->(3*10 + 2) *10 + 1
            temp += x % 10;
            x/= 10;
        }
        if (temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE)
        // check overflow
                return 0;
        return (int) temp;
    }
}