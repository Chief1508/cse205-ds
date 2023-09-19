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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode curr=head;
        int leng=0;
        while(curr!=null)
        {
            curr=curr.next;
            leng++;
        }
        curr=head;
        if(leng==n)
        {
            return head.next;
        }
        for(int i=0;i<leng-n-1;i++)
        {
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
        // ListNode curr=head;
        // int leng=0;
        // while(curr!=null)
        // {
        //     leng++;
        //     curr=curr.next;
        // }
        // curr=head;
       
        // if (leng == n) {
        //     return head.next;
        // }
        // for(int i=0;i<leng-n-1;i++)
        // {
        //     curr=curr.next;
        // }
        // curr.next=curr.next.next;
        // return head;

    }
    
}