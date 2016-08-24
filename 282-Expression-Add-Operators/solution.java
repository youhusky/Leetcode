public class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> res = new ArrayList<String>();
        dfs(res, num, target, 0, 0, 0, "");
        return res;
    }
    
    public void dfs(List<String> res, String num, int target, int start, long currVal, long prevVal, String currExpr) {
        if (start == num.length()) {
            if (currVal == target) {
                res.add(currExpr);
            }
            return;
        }
        
        for (int i = start + 1; i <= num.length(); i++) {
            String expr = num.substring(start, i);
            long val = Long.parseLong(expr);
            
            // 对于'0'开头的非单独'0'字符串，直接跳出
            if (num.charAt(start) == '0' && i != start + 1) {
                break;
            }
            
            // 最开始的当前表达式只是加个数字
            if (start == 0) {
                dfs(res, num, target, i, val, val, expr);
            } else {
                dfs(res, num, target, i, currVal + val, val, currExpr + "+" + expr);
                dfs(res, num, target, i, currVal - val, -val, currExpr + "-" + expr);
                dfs(res, num, target, i, currVal - prevVal + prevVal * val, prevVal * val, currExpr + "*" + expr);
            }
        }
    }
}