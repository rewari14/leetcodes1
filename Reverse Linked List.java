/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
public class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode one = null;
        ListNode two = head;
        ListNode three = null;
        
        while (two != null) 
        {
            three = two.next;
            two.next = one;
            one = two;
            two = three;
        }
        head = one;
        return head;
    }
}
