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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        if(inorder.length == 0 || postorder.length == 0) return null;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<inorder.length; i++) {
            map.put(inorder[i],i);   
        }
    
        return helper(postorder, 0, postorder.length-1, inorder, 0, inorder.length-1, map);
        
    }
    
    private TreeNode helper(int[] postorder, int postL, int postR, int[] inorder, int inL, int inR, Map<Integer, Integer> map) {
        
        if(postL>postR && inL>inR) return null;
        
        
        TreeNode root = new TreeNode(postorder[postR]);
        
        int index = map.get(postorder[postR]);
        
        root.left = helper(postorder, postL, postR- (inR-index) -1 , inorder, inL, index-1, map);
        root.right = helper(postorder, postR- (inR-index), postR-1, inorder, index+1, inR, map);
        
        return root;
        
        
    }
    
    
}