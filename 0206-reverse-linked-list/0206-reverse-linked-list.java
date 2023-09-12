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
    public ListNode reverseList(ListNode head) {
        // Iterative Method
        // ListNode newHead = null;
        // while(head != null){
        //     ListNode nxt = head.next;
        //     head.next = newHead;
        //     newHead = head;
        //     head = nxt;
        // }
        // return newHead;

        // Recursive Method
        if(head == null || head.next == null){
            return head;
        }

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}