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
    int[] list;
    public TreeNode sortedArrayToBST(int[] num) {
        list = num;
        return sortedArrayToBST(0, num.length-1);
    }
    
    private TreeNode sortedArrayToBST(int start, int end) {
        if(start > end) return null;
        int mid = start + (end - start)/2;
        //TreeNode leftNode = 
        TreeNode parent = new TreeNode(list[mid]);
        parent.left = sortedArrayToBST(start, mid-1);
        parent.right = sortedArrayToBST(mid+1, end);
        
        return parent;
    }
}