/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        while(l1!=null && l2!=null)
        {
            int sum=0;
            sum=(l1.val+l2.val);
            if(sum>9)
            {
                int carry=1;
                sum%=sum;
            }
            curr.next=new ListNode(sum);
            l1=l1.next;
            l2=l2.next;
            curr=curr.next;
        }
        return dummy.next;    
    }
}