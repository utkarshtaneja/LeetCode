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
    public static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode temp = head;
        
        while(temp != null){
            prev = curr;
            curr = temp;
            temp = temp.next;
            curr.next = prev;
        }
        return curr;
    }
    public static ListNode remove(ListNode head, int n){
        if(head == null || n <= 0) {
            return head;
        }
        
        if(n == 1) {
            return head.next;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        for(int i = 0; i < n; i++) {
            if(fast == null) {
                return head;
            }
            fast = fast.next;
        }
        
        if(fast == null) {
            return head.next;
        }
        
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        
        return head;
    }
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n <= 0) {
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        for(int i = 0; i <= n; i++) {
            if(fast == null) {
                return head;
            }
            fast = fast.next;
        }

        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}