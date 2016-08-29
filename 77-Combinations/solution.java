public class Solution {
    List<List<Integer>> res = new ArrayList();
    public List<List<Integer>> combine(int n, int k) {
        dfs (1, k, n, new ArrayList());
        return res;
    }
    private void dfs(int start, int k, int n, List<Integer> tmp){
        if (k == 0){
            res.add(new ArrayList(tmp));
            //res.add(tmp);
        }
        for (int i = start; i<= n; i++){
            tmp.add(i);
            dfs(i + 1, k-1, n,tmp);
            tmp.remove(tmp.size()-1);// remove the last one
        }
    }
}