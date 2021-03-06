public class Solution {
    public String reverseWords(String s) {
      // we can do better than one pass
      //ab cd ef
      StringBuilder reversed = new StringBuilder();
      int j = s.length();
      for(int i = s.length()-1; i>=0;i--){
          if(s.charAt(i) == ' '){
              j = i;//save the index
          }
          else if (i == 0|| s.charAt(i-1)==' '){
              if(reversed.length() != 0)  reversed.append(' ');
              reversed.append(s.substring(i,j));//beginIndex -- the begin index, inclusive.

                                                //endIndex -- the end index, exclusive.
          }
      }
      return reversed.toString();
    }
}