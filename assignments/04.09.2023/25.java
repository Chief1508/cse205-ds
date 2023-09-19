import java.io.*;
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
    public ListNode reverseKGroup(ListNode head, int k) 
    {
          ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode prevGroupEnd = dummy;
    ListNode current = head;

    while (current != null) {
        ListNode groupStart = current;
        ListNode groupEnd = getKthNode(current, k);

        if (groupEnd == null) {
            break;  // If there are fewer than k nodes remaining, break the loop
        }

        ListNode nextGroupStart = groupEnd.next;  // Store the next group's start node
        groupEnd.next = null;  // Disconnect the group to be reversed

        reverseList(groupStart);  // Reverse the current group

        // Connect the previous group's end to the reversed group's start
        prevGroupEnd.next = groupEnd;

        // Connect the reversed group's end to the next group's start
        groupStart.next = nextGroupStart;

        // Update prevGroupEnd and current pointers
        prevGroupEnd = groupStart;
        current = nextGroupStart;
    }

    return dummy.next;
}

// Helper function to reverse a linked list
private ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode current = head;

    while (current != null) {
        ListNode nextTemp = current.next;
        current.next = prev;
        prev = current;
        current = nextTemp;
    }

    return prev;
}

// Helper function to get the kth node from the current position
private ListNode getKthNode(ListNode head, int k) {
    for (int i = 1; i < k && head != null; i++) {
        head = head.next;
    }
    return head;  
    }
}