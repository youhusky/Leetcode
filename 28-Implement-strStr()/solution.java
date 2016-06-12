public class Solution {
    public int strStr(String haystack, String needle) {
        //边界条件 source and target
        if(haystack.length() == 0 && needle.length() == 0){
            return 0;
        }
        if (haystack.length() == 0 && needle.length() != 0){
            return -1;
        }
         if (haystack.length() != 0 && needle.length() == 0){
            return 0;
        }
      
        int i,j;
        for(i = 0; i < haystack.length() - needle.length() + 1; i++){
            for (j = 0; j < needle.length() ;j++){
                // not equal
                if (haystack.charAt(i + j) != needle.charAt(j)){
                    break;
                }
            }
                if(j == needle.length()){
                    //equal return index
                    return i;
                }
        }
    return -1;
    }
}