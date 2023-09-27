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
public class Solution {
    public static int length(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Optimal solution 1
        int l1 = length(headA);
        int l2 = length(headB);
        while(l1 > l2) {
            headA = headA.next;
            l1--;
        }
        while(l2 > l1) {
            headB = headB.next;
            l2--;
        }
        while(headA != null && headB != null) {
            if(headA == headB) {
                return headA; 
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}