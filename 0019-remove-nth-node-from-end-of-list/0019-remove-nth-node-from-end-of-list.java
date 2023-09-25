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
    public static int length(ListNode head){
        int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        int size = length(head);
        if(n == size){
            return head.next;
        }
        else{
            int positionToRemove = size - n;
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode prev = dummy;
            
            for(int i = 0; i<positionToRemove; i++) {
                prev = prev.next;
            }
            prev.next = prev.next.next;
            return dummy.next;
        }
    }
}