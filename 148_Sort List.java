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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode f = head.next.next;
        ListNode p = head;
        while (f != null && f.next != null) {
            p = p.next;
            f =  f.next.next;
        }
        ListNode h2 = sortList(p.next);
        p.next = null;
        return merge(sortList(head), h2);
    }
    public ListNode merge(ListNode h1, ListNode h2) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        while (h1 != null && h2 != null) {
            if (h1.val < h2.val) {
                p.next = h1;
                h1 = h1.next;
            }
            else {
                p.next = h2;
                h2 = h2.next;
            }
            p = p.next;
        }
        if (h1 != null)
            p.next = h1;
        if (h2 != null)
            p.next = h2;
        return dummy.next;
    }
    
    
    
    
    
}