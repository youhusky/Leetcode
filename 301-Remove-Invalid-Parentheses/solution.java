public class Solution {
    public void remove(String s, List<String> result, int last_i, int last_j, char[] par) {
    for (int stack = 0, i = last_i; i < s.length(); i++) {
        if (s.charAt(i) == par[0]) stack++;
        if (s.charAt(i) == par[1]) stack--;
        //如果'('比')'大或等的话，就继续扫下去
        if (stack >= 0) continue;
        //否则，我们就找到当前有可能删去的')'，然后删掉看新的string
        for (int j = last_j; j <= i; j++) {
            if (s.charAt(j) == par[1] && (j == last_j || s.charAt(j - 1) != par[1])) {
                remove(s.substring(0, j) + s.substring(j + 1, s.length()), result, i, j, par);
            }
        }
        return;
    }
    
    String reversed = new StringBuilder(s).reverse().toString();
    //如果只从左到右扫了，par[0]还是'('的时候，我们还要再从右往左扫一遍
    if (par[0] == '(') {
        remove(reversed, result, 0, 0, new char[]{')', '('});
    } else {
        //否则两遍都扫完了，就加入结果中去
        result.add(reversed);
    }
}

public List<String> removeInvalidParentheses(String s) {
    List<String> result = new ArrayList<String>();
    remove(s, result, 0, 0, new char[]{'(', ')'});
    return result;
}
}