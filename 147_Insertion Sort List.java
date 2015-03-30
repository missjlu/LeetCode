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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode pre=dummy;
        //ListNode current=head;
        while(head!=null) {
            //find the insert position from start!!!!
            pre=dummy;
            while(pre.next!=null&&pre.next.val<head.val) {
                pre=pre.next;
            }
            ListNode next=head.next;
            head.next=pre.next;
            pre.next=head;
            head=next;
        }
        return dummy.next;
    }
}