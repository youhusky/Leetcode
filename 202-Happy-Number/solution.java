// use set to save the number if the number shows again but not 1 return false
public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<Integer>();
        while (n != 1){
            int temp = 0;
            while (n>0){
                temp += (n%10)*(n%10);
                n /= 10;
            }
            n = temp;
            if (s.contains(n)){
                break;
            }
            else{
                s.add(n);
            }
        }
        System.out.println(s);
        return (n == 1);
    }
}