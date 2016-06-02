public class Solution {
    public int reverse(int x) {
        long temp = 0;
        
        while (x != 0){
            
            temp = temp * 10;
            temp += x % 10;
            x/= 10;
        }
        if (temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE)
                return 0;
        return (int) temp;
    }
}