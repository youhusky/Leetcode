public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        String paren = "";
        helper(result,paren, n, n);
        return result;
    }
    
    private void helper(List<String> result, String paren,int left, int right) {
        if (left == 0 && right == 0) {
            result.add(paren);
            return;
        }
        if (left > 0) {
            helper(result, paren + "(", left - 1, right);
        }
        if (right > 0 && left < right) {
            helper(result, paren + ")", left, right - 1);
        }
    }
}