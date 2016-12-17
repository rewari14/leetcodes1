/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode one = head;
        
        if(head!=null)
        {
        
            while(one.next!=null)
            {
                if(one.val == one.next.val)
                {
                    one.next = one.next.next;
                }
                else
                {
                    one = one.next;
                }
            }
        }
        return head;
    }
}
