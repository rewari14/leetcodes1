/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        
        if(head.next == null)
        {
            head = null;
        }
        
        if(head!=null)
        {
            
            ListNode slow = head;
            ListNode fast = head;
            int count=0;
            int i=1;
            while(slow != null)
            {
                count ++;
                slow = slow.next;
            }
            
            if(count == n)
            {
                head = head.next;
            }
            
            while(i<count-n)
            {
                fast = fast.next;
                i++;
            }
            
            fast.next = fast.next.next;
        }
            return head;
    }
}
