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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        
        List<Integer> item = new ArrayList<>();
        item.add(root.val);
        helper(root, sum-root.val, item, res);
        return res;
    }
    
    
    public void helper(TreeNode root, int sum, List<Integer> item, List<List<Integer>> res){
        
        //if(root == null) return;
        
        if(root.left == null && root.right == null && sum ==0) {
            
            //don't add item directly, have to initiate another arraylist
            res.add(new ArrayList<Integer>(item));
            return;
        }
        
        if(root.left != null) {
            item.add(root.left.val);
            helper(root.left, sum-root.left.val,item,res);
            item.remove(item.size()-1);
        }
        
        
        if(root.right != null) {
            item.add(root.right.val);
            helper(root.right, sum-root.right.val,item,res);
            item.remove(item.size()-1);
        }
        
        
        
    }
    
    
    
}