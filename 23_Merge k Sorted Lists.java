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
    public ListNode mergeKLists(List<ListNode> lists) {
        //pre-condition check!!!
        if(lists == null || lists.size() == 0) return null;
        
        int end = lists.size()-1;
        
        while(end >0) {
            
            //pay attention to set start = 0 every iteration
            int start = 0;
            while(start < end) {
                lists.set( start, merge2Lists(lists.get(start), lists.get(end)) );
                start++;
                end--;
            }
        }
        
        return lists.get(0);
        
    }
    
    private ListNode merge2Lists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            
            p = p.next;
        }
        
        if(l1 != null) p.next = l1;
        if(l2 != null) p.next = l2;
        
        return dummy.next;
        
    }
    
    
    
}