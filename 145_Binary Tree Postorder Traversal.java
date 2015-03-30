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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        
        while(root!= null || !stack.isEmpty()) {
            
            if(root!= null) {
                
                stack.push(root);
                root = root.left;
                
            }
            
            else {
                
                TreeNode peekNode = stack.peek();
                
                if( peekNode.right != null && peekNode.right != pre) {
                    root = peekNode.right;
                }
                
                else {
                    
                    stack.pop();
                    res.add(peekNode.val);
                    pre = peekNode;
                    
                }
                
                
            }
            
            
            
        }
        
        return res;
        
        
    }
}