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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode p = headA;
        ListNode q = headB;
        int lengthA = 0;
        int lengthB = 0;
        
        while(p != null) {
            p = p.next;
            lengthA++;
        }
        while(q != null) {
            q = q.next;
            lengthB++;
        }
        
        
        while(lengthA>lengthB && headA != null) {
             headA = headA.next;
             lengthA--;
        }
        
        while(lengthB>lengthA && headB != null) {
             headB = headB.next;  
             lengthB--;
        }
        
        while(headA !=null && headB !=null) {
            if(headA.val == headB.val)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }
        
        return null;
        
        
    }
}