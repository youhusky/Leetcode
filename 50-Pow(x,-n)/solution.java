public class Solution {
    public double myPow(double x, int n) {
      if(n<=0){
          return 1/powPositive(x, n);
      }
      else{
          return powPositive(x,n);
      }
    }
    private double powPositive(double x, int n){
        if (n==0)
        {
            return 1;
        }
        double t = powPositive(x, n/2);
        if (n%2==0){
            return t*t;
        }
        else{
            return t*t*x;
        }
    }
}