/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        
        RandomListNode dummy = new RandomListNode(0);
        RandomListNode pre = dummy;
        RandomListNode helper = head;
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        
        while(helper!=null) {
            
            
            
            RandomListNode copy = new RandomListNode(helper.label);
            map.put(helper, copy);
            
            pre.next = copy;
            pre = pre.next;
            helper = helper.next;
            
        }
        
        helper = head;
        pre = dummy;
        
        while(helper!=null) {
            pre.next.random = map.get(helper.random);
            pre = pre.next;
            helper = helper.next;
        }
        
        
        return dummy.next;
        
        
        
    }
}