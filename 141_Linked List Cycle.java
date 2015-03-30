/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        
        ListNode fast = head;
        ListNode slow = head;
        
        fast = fast.next.next;
        slow = slow.next;
        
        while(fast != null && fast.next != null) {
            if(fast!=slow) {
                fast = fast.next.next;
                slow = slow.next;
            }
            else return true;
        }
        
        return false;
        
        
        
    }
}