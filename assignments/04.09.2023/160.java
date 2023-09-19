/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        int lengthA=getLength(headA);
        int lengthB=getLength(headB);
        
        ListNode currA=headA;
        ListNode currB=headB;

        while(lengthA>lengthB)
        {
            currA=currA.next;
            lengthA--;
        }
        while(lengthB>lengthA)
        {
            currB=currB.next;
            lengthB--;
        }
        while(currA!=currB)
        {
            currA=currA.next;
            currB=currB.next;
        }
        return currA;
       

    }
     private int getLength(ListNode head)
        {
            int leng=0;
            ListNode curr=head;
            while(curr!=null)
            {
                leng++;
            }
            return leng;
        }
}