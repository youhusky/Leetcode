public class Solution {
    //
    public String reverseString(String s) {
        int halflength = s.length() / 2;
        char[] ch = s.toCharArray();
        char temp;
        for (int i = 0; i < halflength; i++){
            temp = ch[s.length() - 1 - i];
            ch[s.length() - 1 - i] = ch[i];
            ch[i] = temp;
        }
        return new String (ch);
    }
}