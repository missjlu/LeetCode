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
    
    //inorder traversal, when sequence is not correct, record
    public void recoverTree(TreeNode root) {
        //method helper can only accept TreeNode type, if pass "null", will generate error
        if(root == null) return;
        
        List<TreeNode> res = new ArrayList<>();
        List<TreeNode> pre = new ArrayList<>();
        pre.add(null);
        helper(root,pre,res);
        
        //call by value
        if(res.size()>0) {
            int temp = res.get(1).val;
            res.get(1).val = res.get(0).val;
            res.get(0).val = temp;
        }
    }
    
    
    private void helper(TreeNode root, List<TreeNode> pre, List<TreeNode> res) {
        
        if(root == null) return;
        
        helper(root.left, pre, res);
        
        if(pre.get(0) != null) {
            
            if(pre.get(0).val>root.val) {
                if(res.size() == 0) {
                    res.add(pre.get(0));
                    res.add(root);
                    
                }
                else {
                    res.set(1,root);
                }
                
            }
        
        }
        
        pre.set(0,root);
        
        helper(root.right, pre, res);
        
    }
    
    
    
    
}