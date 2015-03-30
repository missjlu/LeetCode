/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
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
    
    ListNode list;
    public TreeNode sortedListToBST(ListNode head) {
        ListNode node = head;
        int length = 0;
        while(node != null) {
            length++;
            node = node.next;
        }
        list = head;
        return sortedListToBST(0,length-1);
    }
    
    public TreeNode sortedListToBST(int start, int end) {
        if (start > end) return null;
        int mid = start + (end - start)/2;
        TreeNode left = sortedListToBST(start, mid-1);
        TreeNode parent = new TreeNode(list.val);
        parent.left = left;
        list = list.next;
        parent.right = sortedListToBST(mid+1, end);
        return parent;
    }
}