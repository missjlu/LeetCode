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
    
    //1->2->3->4->5
    //1->4->3->2->5
    public ListNode reverseBetween(ListNode head, int m, int n) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        
        int count = 1;
        while(count < m) {
            pre = pre.next;    
            count++;
        }
        
        ListNode tail = pre.next;
        
        while(n-m > 0) {
            ListNode newHead = tail.next;
            tail.next = newHead.next;
            newHead.next = pre.next;
            pre.next = newHead;
            n--;
        }
        
        return dummy.next;
        
        
        
        
    }
}