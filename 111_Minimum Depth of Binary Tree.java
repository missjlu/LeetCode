/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode rightmost = root;
        int depth = 1;
        while(!q.isEmpty()) {
        TreeNode node = q.poll();
        if(node.left == null && node.right == null) break;
        if(node.left!=null) q.add(node.left);
        if(node.right!=null) q.add(node.right);
        if(node == rightmost) {
            depth++;
            rightmost = (node.right == null) ? node.left : node.right;
        }
        }
        return depth;
    }
}