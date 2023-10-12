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
            int positionToRemove = size - n - 1;
            ListNode temp = head;
            for(int i = 0; i<positionToRemove; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            return head;
        }
    }
}