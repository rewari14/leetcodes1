/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        
        int count=0;
        int count1=0;
        ListNode head1 = head;
        ListNode one = null;
        ListNode two = head;
        ListNode three = null;
        
        if(head!=null && head.next != null)
        {
            while(head1!=null)
            {
                count++;
                head1 = head1.next;
            }
            count1 = (count/2);
            while(count1>0)
            {
                three = two.next;
                two.next = one;
                one = two;
                two = three;
                count1--;
            }
            
            head1 = one;
            head = two;
            
            if(count%2 == 0)
            {
                while(head!=null)
                {
                    if(head.val == head1.val)
                    {
                        head = head.next;
                        head1 = head1.next;
                    }
                    else
                    {
                        return false;
                    }
                }
            }
            
            else
            {
                while(head.next!=null)
                {
                    if(head.next.val == head1.val)
                    {
                        head = head.next;
                        head1 = head1.next;
                    }
                    else
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
