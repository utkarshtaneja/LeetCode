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
    public static int length(ListNode head) {
        int count = 0;
        ListNode curr = head;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Brute Force
        // Map<ListNode, Integer> map = new HashMap<>();

        // ListNode curr = headA;
        // while (curr != null) {
        //     if (map.containsKey(curr)) return curr;
        //     map.put(curr, 1);
        //     curr = curr.next;
        // }

        // curr = headB;
        // while (curr != null) {
        //     if (map.containsKey(curr)) return curr;
        //     map.put(curr, 1);
        //     curr = curr.next;
        // }

        // return null;

        // Optimal
        int l1 = length(headA);
        int l2 = length(headB);

        while (l1 > l2) {
            headA = headA.next;
            l1--;
        }
        while (l2 > l1) {
            headB = headB.next;
            l2--;
        }

        while (headA != null && headB != null) {
            if (headA == headB) return headA; 
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}