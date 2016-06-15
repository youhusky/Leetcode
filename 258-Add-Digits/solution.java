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