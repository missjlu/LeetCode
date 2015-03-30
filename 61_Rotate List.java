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
    public ListNode rotateRight(ListNode head, int n) {
        if(head == null) return null;
        
        ListNode runner = head;
        int counter = 1;
        
        while(runner.next != null) {
            runner = runner.next;
            counter++;
        }
        runner.next = head;
        
        if(n>counter) {
            n %= counter;
        }
        
        
        runner = head;
        ListNode walker = head;
        
        while(n>0) {
            runner = runner.next;
            n--;
        }
        
        
        
        while(runner.next != head) {
            runner = runner.next;
            walker = walker.next;
            
        }
        
        ListNode newHead = walker.next;
        walker.next = null;
        
        return newHead;
        
    }
}