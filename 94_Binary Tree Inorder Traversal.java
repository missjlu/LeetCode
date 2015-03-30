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
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        
        //Node root is used to protect the node to be pushed into the stack
        //inorder: res.add(root.val) when pop
        //preorder: res.add(root.val) when push
        while(root!=null || !stack.isEmpty()) { 
            
            while(root!=null) {
            stack.push(root);
            root = root.left;
            }
            
            root = stack.pop();
            list.add(root.val);
            root = root.right;
            
        }
        
        return list;
    }
    
    
}




