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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        List<Integer> item = new ArrayList<>();
        
        queue.add(root);
        int curr = 0;
        int last = 1;
        
        
        while(!queue.isEmpty()) {
            
            
            root = queue.poll();
            last--;
            item.add(root.val);
            
            
            if(root.left != null) {
                queue.add(root.left);
                curr++;
            }
            
            if(root.right != null) {
                queue.add(root.right);
                curr++;
            }
            
            
            
            if(last == 0) {
                last = curr;
                curr = 0;
                
                res.add(item);
                item = new ArrayList<>();
            }
            
            
            
        }
        
        return res;
        
        
        
    }
}