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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)  
            return null;  
        int i=0;  
        ListNode runner = head;  
        while(runner!=null && i<n)  
        {  
            runner = runner.next;  
            i++;  
        }  
        if(i<n)  
            return head;  
        if(runner == null)  
            return head.next;  
        ListNode walker = head;  
        while(runner.next!=null)  
        {  
            walker = walker.next;  
            runner = runner.next;  
        }  
        walker.next = walker.next.next;  
        return head; 
    }
}