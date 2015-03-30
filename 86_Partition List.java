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
    public ListNode partition(ListNode head, int x) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode curr = dummy;
        
        
        //pre is pointing to the last node that is < x, curr is pointing to the node before the node to be checked
        while(curr.next != null) {
            
            if(curr.next.val < x) {
                //like node 1 in this example, it is already in the correct place, no need to change the position
                if(pre.next == curr.next) {
                    curr = curr.next;
                
                    
                }
                
                else {
                    ListNode currNext = curr.next;
                    ListNode nextNext = curr.next.next;
                    currNext.next = pre.next;
                    pre.next = currNext;
                    curr.next = nextNext;
                }
                
                pre = pre.next;
                
            } 
            
            else {
                curr = curr.next;
            }
            
            
            
            
        }
        
        return dummy.next;
        
        
        
    }
}