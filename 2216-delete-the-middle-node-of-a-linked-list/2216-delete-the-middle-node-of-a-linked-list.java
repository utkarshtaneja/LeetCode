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
    public static ListNode findMiddle(ListNode head){
        if(head.next == null || head.next.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode mid = findMiddle(head);
        if(mid == head){
            head.next = null;
            return head;
        }
        ListNode temp = head;
        while(temp != null){
            if(temp.next == mid){
                temp.next = mid.next;
                mid.next = null;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
}