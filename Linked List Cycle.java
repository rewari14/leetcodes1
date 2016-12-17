/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
    if(head != null)
    {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && slow !=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
                
            if(fast == slow)
            {
                return true;
            }

                
        }
    }   
            return false;
        
    }
}
