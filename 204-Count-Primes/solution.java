public class Solution {
    public int countPrimes(int n) {
        boolean notPrime[] = new boolean[n+3];
        notPrime[0] = notPrime[1] = true;
        for (int i = 2; i*i < n; i++){
            if (!notPrime[i]){
            int c = i * i;
            while (c < n){
                notPrime[c] = true;
                c += i;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++){
            if (!notPrime[i]){
                ans++;
            }
        }
        return ans;
    }
}