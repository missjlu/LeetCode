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
    public void reorderList(ListNode head) {
        
        if(head == null || head.next == null) return;
        
        ListNode mid = findMid(head);
        
        
        
        mid = reverseList(mid);
        
        ListNode midpoint = mid;
        
        ListNode pre = head;
        
        while(pre.next != midpoint && mid.next != null) {
            ListNode helper = pre.next;
            pre.next = mid;
            pre = helper;
            helper = mid.next;
            mid.next = pre;
            mid = helper;
        }
    }
    
    public ListNode findMid(ListNode head){
            ListNode p = head;
            ListNode q = head;
        while(q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
        }
         return p;
        }
        
        
    public ListNode reverseList(ListNode tail) {
    //reverse the part after mid point
        ListNode pre = new ListNode(0);
        pre.next = tail;
        ListNode p = tail;
        while(tail.next != null) {
            pre.next = tail.next;
            tail.next = tail.next.next;
            pre.next.next = p;
            p = pre.next;
        }
        return pre.next;
    
    }
    
}