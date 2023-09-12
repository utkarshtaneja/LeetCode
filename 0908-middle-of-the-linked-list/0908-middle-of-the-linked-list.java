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
    public ListNode middleNode(ListNode head) {
        // Brute Force Method
        // if(head == null){
        //     return null;
        // }
        // int count = 0;
        // ListNode temp = head;

        // while(temp != null){
        //     temp = temp.next;
        //     count++;
        // }

        // temp = head; 
    	// for(int i = 0; i < count/2; i++) {
        // 	temp = temp.next;
    	// }

        // return temp;

        // Optimal Approach
        if(head == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}