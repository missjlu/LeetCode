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
    public void flatten(TreeNode root) {
        List<TreeNode> pre = new ArrayList<>();
        pre.add(null);
        helper(root, pre);
    }
    
    
    public void helper(TreeNode root, List<TreeNode> pre) {
        
        if(root == null) return;
        
        //this recursion's pre.get(0) is last recursion's root(when done, last recursion's root.right has been changed)
        TreeNode rightNode = root.right;
        if(pre.get(0) != null) {
            
            pre.get(0).left = null;
            pre.get(0).right = root;
        }
        
        pre.set(0,root);
        helper(root.left, pre);
        helper(rightNode, pre);
        
        
        
        
        
    }
    
    
}