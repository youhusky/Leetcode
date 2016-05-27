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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
       if (root== null)
        return res;
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
    while(!queue.isEmpty()){
        ArrayList<Integer> level = new ArrayList<Integer>();
        int size = queue.size();
        int count = 0;
        for(int i=0;i<size;i++){
            TreeNode node = queue.poll();
            if (count%2==0)
                level.add(node.val);
            else
                level.add(0, node.val);
            if(node.left != null)
                queue.add(node.left);
            if(node.right != null)
                queue.add(node.right);
        }
        count++;
        res.add(level);
    }
    }
}