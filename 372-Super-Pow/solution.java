public class Solution {
    public int superPow(int a, int[] b) {
        if(a==1)return 1;
        int l=b.length,m=a,i,v=0;
        int[] p = new int[1337];
        int mod = a%1337;
        p[0] = mod;
        for(i=1;i<1337;i++){
            m = (int)(((long)m*a) % 1337);
            if(m!=mod)p[i]=m;
            else break;
        }
        for(int j=0;j<l;j++){
            v = ((v*10) + b[j]) % i;
        }
        return p[v-1];
    }
}