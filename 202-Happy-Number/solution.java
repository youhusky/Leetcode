// use set to save the number if the number shows again but not 1 return false
public class Solution {
    public boolean isHappy(int n) {
        if (n <= 0) return false;
    HashSet<Integer> set = new HashSet<Integer>();
    while(n !=1 && !set.contains(n)) {
        set.add(n);
        int m = n;
        n = 0;
        while(m != 0) {
            n += (m%10)*(m%10);
            m = m/10;
        }
    }
    if (n == 1) return true;
    else return false;
    }
}