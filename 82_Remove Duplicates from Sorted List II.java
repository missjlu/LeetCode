/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        
        dummy.next = head;
        
        if(head == null) return null;
        
        ListNode pre = dummy;
        ListNode curr = head;
        
        
        while(curr != null) {
            while(curr.next!=null && pre.next.val == curr.next.val) 
                curr = curr.next;
                //pre.next = curr.next;
            
            
            if(pre.next != curr) {
                pre.next = curr.next;
            }
            else {
                pre = pre.next;
            }
            
            curr = curr.next;
        }
        
        
        return dummy.next;
        
    }
}