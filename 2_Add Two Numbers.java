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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        int value1 = 0, value2 = 0, carry = 0, sum = 0;
        
        
        while(l1 != null || l2 != null) {
            value1 = (l1 == null? 0:l1.val);
            value2 = (l2 == null? 0:l2.val);
            sum = (value1 + value2 + carry)%10;
            
            carry = (value1 + value2 + carry)/10;
            pre.next = new ListNode(sum);
        
            pre = pre.next;
            
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        
        }
        
        if(carry>0)
            pre.next = new ListNode(carry);
            
        return dummy.next;
        
    }
}