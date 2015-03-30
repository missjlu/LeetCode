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
    public ListNode swapPairs(ListNode head) {
        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;
        ListNode prev = dummyhead;
        //prev node is always pointing to the node before the pairs to be swapped
        while(prev.next!=null && prev.next.next!=null) {
            ListNode r=prev.next.next;
            ListNode q = prev.next;
            prev.next = r;
            q.next = r.next;
            r.next = q;
            prev = q;

        }
        return dummyhead.next;
        
    }
}


