//101   110 111 最长公共子串
public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int cnt = 0;
        while (m!=n){
            m >>= 1;
            n >>= 1;
            cnt +=1;
        }
        return n<<cnt;
    }
}