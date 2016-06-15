// use set to save the number if the number shows again but not 1 return false
public class Solution {
    public boolean isHappy(int n) {
    if (n <= 0) return false;
    HashSet<Integer> set = new HashSet<Integer>();
    while(n !=1 && !set.contains(n)) {
        set.add(n);
        int m = n;  //temp
        n = 0;
        //7 -49 -97- 130 - 10
        while(m != 0) {
            n += (m%10)*(m%10);
            m = m/10;
        }
    }
    
    return (n == 1);
    }
}