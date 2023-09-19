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
    public boolean isPalindrome(ListNode head) 
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode sec=reverseNode(slow);
        ListNode first=head;
        while(sec!=null)
        {
            if(first.val!=sec.val)
            {
                return false;
            }
            sec=sec.next;
            first=first.next;
        }
        return true;
        } 
        private ListNode reverseNode(ListNode head)
        {
            ListNode prev=null;
            ListNode temp=null;
            ListNode curr=head;
            while(curr!=null)
            {
                temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }
            return prev; 
    }
}