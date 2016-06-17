public class Solution {
    public String multiply(String num1, String num2) {
        String s1 = new StringBuilder(num1).reverse().toString();
        String s2 = new StringBuilder(num2).reverse().toString();
        
        int[] d = new int [s1.length()+s2.length()];
        
        for (int i = 0; i < s1.length(); i++){
            for (int j= 0; j < s2.length(); j++){
                d[i+j] += (s1.charAt(i) - '0') * (s2.charAt(j) - '0'); 
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< d.length; i++){
            int digit = d[i] % 10;
            int carry = d[i] / 10;
            if (i+1<d.length){
                d[i+1] += carry;
            }
            sb.insert(0,digit);//末位
        }
            System.out.println(sb);
            while(sb.charAt(0) == '0' && sb.length()>1){//0*0
                sb.deleteCharAt(0);//删除先头0 
            }
        return sb.toString();
    }
}