/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

// Encodes a tree to a single string.
public String serialize(TreeNode root) {
    StringBuilder sb = new StringBuilder();
    if (root == null)
        return sb.append("null").toString();
    Queue<TreeNode> que = new LinkedList<>();
    que.add(root);
    while (!que.isEmpty()) {
        TreeNode node = que.remove();
        if (node != null) {
            sb.append(node.val).append(",");
            que.add(node.left);
            que.add(node.right);
        } else {
            sb.append("null").append(",");
        }
    }
    return sb.toString();
}

// Decodes your encoded data to tree.
public TreeNode deserialize(String data) {
    List<String> list = new ArrayList<>();
    list.addAll(Arrays.asList(data.split(",")));
    String val = list.remove(0);
    TreeNode root = val.equals("null")?null:new TreeNode(Integer.parseInt(val));
    if (root == null) return root;
    
    Queue<TreeNode> que = new ArrayDeque<>();
    que.add(root);
    while(!que.isEmpty()) {
        TreeNode node = que.remove();
        val = list.remove(0);
        if (val.equals("null")) {
            node.left = null;
        } else {
            node.left = new TreeNode(Integer.parseInt(val));
            que.add(node.left);
        }
        val = list.remove(0);
        if (val.equals("null")) {
            node.right = null;
        } else {
            node.right = new TreeNode(Integer.parseInt(val));
            que.add(node.right);
        }
    }        
    return root;
}
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));