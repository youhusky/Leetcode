public class Solution {
    public int[] plusOne(int[] digits) {
        return plusDigit(digits, 1);
    }
    private int[] plusDigit(int[] digits, int digit){
        if (digits == null || digits.length == 0){
            return null;
        }
        int carry = digit;
        int[] result = new int[digits.length];  //new int[2] == [x,1] 2 == length 
        for (int i = digits.length - 1; i>=0; i--){ //last digit
            result[i] = (digits[i] + carry) % 10;  //末位相加 取余
            carry = (digits[i] + carry) /  10;  //进位  用'/'
        }
        //carry == 1
        if (carry == 1){
            int[] finalResult = new int[digits.length + 1]; //999+1=1000
            finalResult[0] = 1;
            finalResult[digits.length] = (digits[digits.length -1] + digit) % 10;
            return finalResult;
        }
        return result;
    }
}