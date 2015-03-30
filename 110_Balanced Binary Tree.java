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
    public boolean isBalanced(TreeNode root) {
        return maxDepth(root) != -1;
    }
    
    private int maxDepth(TreeNode root) {
        if(root ==  null) return 0;
        
        int l = maxDepth(root.left);
        if(l==-1) return -1;
        int r = maxDepth(root.right);
        if(r==-1) return -1;
        return Math.abs(l-r) >1 ? -1: Math.max(l,r) +1;
        
    }
    
}