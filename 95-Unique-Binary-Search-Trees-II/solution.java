/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0){
            return new ArrayList<TreeNode>();
        }
        else{
            return helper(1,n);
        }
    }
    private List<TreeNode> helper (int m, int n){
        List<TreeNode> res = new ArrayList();
        if (m > n){
            res.add(null);
            return res;
        }
        for (int i = m; i<= n; i++){
            List<TreeNode> ls = helper(m,i-1);
            List<TreeNode> rs = helper(i+1,n);
            for(TreeNode l:ls){
                for (TreeNode r:rs){
                    TreeNode curr = new TreeNode(i);//有一个不是null，就会输出。如果两个都是null的话就不会
                    curr.left = l;
                    curr.right = r;
                    res.add(curr);
                }
            }
        }
        return res;
    }
}