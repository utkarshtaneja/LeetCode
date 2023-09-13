/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // Brute Force Method
        // Set<ListNode> set = new HashSet<>();
        // while(head != null) {
        //     if(set.contains(head)){
        //         return true;
        //     }
        //     set.add(head);
        //     head = head.next;
        // }
        // return false;


        // Optimal Approach
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}