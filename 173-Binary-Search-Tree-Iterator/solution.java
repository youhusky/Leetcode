/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    int index = 0;
    ArrayList<TreeNode> res = new ArrayList<TreeNode>();
    public BSTIterator(TreeNode root) {
        dfs(root, res);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if (index < res.size())
            return true;
        return false;
    }
    
    private void dfs(TreeNode root, ArrayList<TreeNode> res){
        if (root == null)
            return;
        //use in-order traversal    
        dfs(root.left, res);
        res.add(root);
        dfs(root.right, res);
    }
    /** @return the next smallest number */
    public int next() {
        // get next val
        return res.get(index++).val;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */