public class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        lexicalOrderHelper(res, 1, n);
        return res;
    }

    private void lexicalOrderHelper(List<Integer> res, int i, int n) {
        if(i > n) return;
        res.add(i);
        lexicalOrderHelper(res, i * 10, n);
        if(i + 1 <= (i / 10) * 10 + 9) lexicalOrderHelper(res, i + 1, n);
        else return;
    }
}