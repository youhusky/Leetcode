public class Solution {
    public boolean isAdditiveNumber(String num) {
        //枚举前两个数的位置，因为前两个数决定了num是否为Additive
        for(int i = 0; i < num.length(); i++) {
            for(int j = i + 1; j < num.length() - i - 1; j++) {
                String first = num.substring(0, i + 1);
                String second = num.substring(i + 1, j + 1);
                if(valid(j + 1, num, first, second))
                    return true;
            }
        }
        return false;
    }

    private boolean valid(int start, String num, String first, String second) {
        if(start == num.length())
            return true;
        long f = Long.parseLong(first);
        long s = Long.parseLong(second);
        if(!Long.toString(f).equals(first) || !Long.toString(s).equals(second))
            return false;
        long sum = f + s;
        String sumS = Long.toString(sum);
        if(start + sumS.length() > num.length())
            return false;
        String third = num.substring(start, start + sumS.length());
        long t = Long.parseLong(third);
        if(!Long.toString(t).equals(third) || t != sum)
            return false;
        return valid(start + sumS.length(), num, second, third);
    }
}