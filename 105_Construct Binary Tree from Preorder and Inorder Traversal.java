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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<inorder.length; i++) {
            map.put(inorder[i],i);
        }
        
        return helper(preorder, 0, preorder.length-1, inorder, 0, preorder.length-1, map);
    }
    
    public TreeNode helper(int[] preorder, int preL, int preR, int[] inorder, int inL, int inR, Map<Integer, Integer> map ) {
        
        if(preR<preL && inR<inL) return null;
        
        TreeNode root = new TreeNode(preorder[preL]);
        int index = map.get(preorder[preL]);
        root.left = helper(preorder, preL+1, preL+ index-inL, inorder, inL, index-1, map);
        root.right = helper(preorder, preL+ index-inL+1, preR, inorder, index+1, inR, map);
        return root;
    }
    
    
}