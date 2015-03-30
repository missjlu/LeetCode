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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        if(root == null) return res;
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        int last = 1;
        int curr = 0;
        
        boolean levelFlag = false;
        
        while(!queue.isEmpty()) {
          
        List<Integer> item = new ArrayList<>();
        
        while(last>0) 
        {   
            
            TreeNode currNode= queue.poll();
            item.add(currNode.val);
            last--;
            
            if(currNode.left != null) {
                queue.add(currNode.left);
                curr++;
            }
            
            if(currNode.right != null) {
                queue.add(currNode.right);
                curr++;
            }
            
        }
        
        if(levelFlag) {
            Collections.reverse(item);
        }
        
        levelFlag = !levelFlag;
        
        res.add(item);
        last = curr;
        curr = 0;
            
        }
        
        
        return res;
        
        
    }
}