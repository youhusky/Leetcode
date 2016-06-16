public class Solution {
    // x^n  = x^n/2 * x^n/2 * x%2
    // x^-n = 1/x^n
    public double myPow(double x, int n) {
        return n<=0 ? 1/powPositive(x, n) : powPositive(x,n);
    }
    private double powPositive(double x, int n){
        if (n==0)   return 1;
        double t = powPositive(x, n/2);
        return n%2==0 ? t*t: t*t*x;
    }
}