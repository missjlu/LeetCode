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
    private int pathSum;
    public int maxPathSum(TreeNode root) {
        pathSum = Integer.MIN_VALUE;
        findMax(root);
        return pathSum;
    }
    
    private int findMax(TreeNode node) {
        int sum = 0;
        if (node == null) return 0;
        int left = findMax(node.left);
        int right = findMax(node.right);
        pathSum = Math.max(node.val + left + right , pathSum);
        sum = node.val + Math.max(left, right);
        return sum > 0 ? sum : 0;
    }
    
}