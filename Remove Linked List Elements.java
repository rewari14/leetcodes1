/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
     
        ListNode slow = head;
        ListNode fast = head;
        
        if(head != null)
        {
            while(fast.next != null)
            {
                if(fast.val == val)
                {
                    fast.val = fast.next.val;
                    fast.next = fast.next.next;
                }
                
                else
                {
                    fast = fast.next;
                } 
            }
            
            if(fast.val == val && slow!=fast)
            {
                while(slow.next != fast)
                {
                    slow = slow.next;
                }
                slow.next = null;
                
            }
            if(fast.val == val && slow==fast)
            {
                head = null;
            }
        }    
        return head;
    }
}
