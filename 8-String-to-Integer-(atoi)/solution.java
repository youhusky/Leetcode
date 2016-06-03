public class Solution {
    public int myAtoi(String str) {
        if (str == null || str.length()==0) return 0;
        // trim left and right space
        String strTrim = str.trim();
        int len = strTrim.length();
        int sign = 1;
        // index for iteration
        int i = 0;
         if (strTrim.charAt(i) == '+')  i++;
         else if (strTrim.charAt(i) == '-'){i++; sign = -1;}
         
         long res = 0;
         while (i<len){
             if (strTrim.charAt(i) < '0' || strTrim.charAt(i) > '9') break;
              res = 10* res + sign * (strTrim.charAt(i) - '0');
              //overflow
              if (res > Integer.MAX_VALUE)  return Integer.MAX_VALUE;
              else if (res< Integer.MIN_VALUE) return Integer.MIN_VALUE;
              i++;
         }
        return (int) res;
    }
}