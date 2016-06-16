public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        int res = 10;//f(1)
        int uniqueNumber = 9;//f(2) = 9*9
        int availableNumber = 9;
        while(n > 1 && availableNumber>0){
            uniqueNumber *= availableNumber;
            res += uniqueNumber;
            availableNumber--;
            n--;
        }
        return res;
    }
}