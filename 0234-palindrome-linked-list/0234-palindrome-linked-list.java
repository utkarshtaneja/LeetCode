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
    public static ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
    public static ListNode findMiddle(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode mid = findMiddle(head);

        ListNode secondHalfStart = reverseList(mid);

        ListNode firstHalfStart = head;
        ListNode secondHalf = secondHalfStart;

        while (secondHalf != null) {
            if (firstHalfStart.val != secondHalf.val) return false;
            firstHalfStart = firstHalfStart.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }
}