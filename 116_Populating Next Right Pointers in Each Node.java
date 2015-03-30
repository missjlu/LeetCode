/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
 
 
 //currHead: to be linked, lastHead: already linked, lastCurr: its left&right children to be added to pre

public class Solution {
    public void connect(TreeLinkNode root) {
        
        if(root == null) return;
        
        TreeLinkNode currHead = null;
        TreeLinkNode pre = null;
        TreeLinkNode lastHead = root;
        
        while(lastHead != null) {
        
        while(lastHead != null)
        {
        
        
            if(currHead == null) {
            
                currHead = lastHead.left;
                pre = currHead;
            
            }
        
            else {
                pre.next = lastHead.left;
                pre = pre.next;
            }
        
        
        
        
            if(currHead == null) {
            
                currHead = lastHead.right;
                pre = currHead;
            
            }
        
            else {
                pre.next = lastHead.right;
                pre = pre.next;
            }
        
        
        lastHead = lastHead.next;
        }
        
        lastHead = currHead;
        
        currHead = null;
        
        }
        
    }
}