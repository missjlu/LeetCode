/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 


// iterative
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> res = new ArrayList<>();
        
        if(root == null) 
            return res;
        
        Stack<TreeNode> stack = new Stack<>();
        
        while(!stack.isEmpty() || root != null) {
            
            if(root != null) {
                stack.push(root);
                res.add(root.val);
                root = root.left;
                
            }
            
            else {
                
                root = stack.pop();
                root = root.right;
                
            }
        
        }
        
        return res;
        
}
}