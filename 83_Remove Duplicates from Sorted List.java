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
        ListNode p = head;
        while(p != null && p.next != null) {
            if(p.val != p.next.val)
                p = p.next;
            else {
                p.next = p.next.next;
                //cannot move p forward because don't know if p == p.next.next
                //p = p.next;
            }
        }     
        
        return head;

        
    }
}