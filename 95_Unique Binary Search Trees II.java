/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; left = null; right = null; }
 * }
 */
public class Solution {
    public List<TreeNode> generateTrees(int n) {
        return helper(1,n);
        
    }
    
    private List<TreeNode> helper(int left, int right) {
        
        //every time need to new a res to store the temporary res for each level
        List<TreeNode> res = new ArrayList<>();
        if(left > right){
            res.add(null);
            return res;
        }
        
        for(int n=left; n<=right; n++) {
            
            List<TreeNode> leftList = new ArrayList<>(helper(left, n-1));
            List<TreeNode> rightList = new ArrayList<>(helper(n+1, right));
            
            for(int i=0; i<leftList.size(); i++) {
                for(int j=0; j<rightList.size(); j++) {
                    TreeNode root = new TreeNode(n);
                    root.left = leftList.get(i);
                    root.right = rightList.get(j);
                    res.add(root);
                }
            }
            
            
        }
        return res;
        
        
    }
    
    
    
    
}