public class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0){
            return true;
        }
        int left = 0, right = s.length() - 1;
        while (left < right){
            //find the left
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            //find the right
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right)))
            {
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}