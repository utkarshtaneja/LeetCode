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

        if (l1 > l2) {
            l1 = l1 - l2;

            ListNode curr1 = headA;
            ListNode curr2 = headB;

            while (l1 > 0) {
                curr1 = curr1.next;
                l1--;
            }

            while (curr1 != null && curr2 != null) {
                if (curr1 == curr2) return curr1;
                curr1 = curr1.next;
                curr2 = curr2.next;
            }

            return null;
        }
        else {
            l2 = l2 - l1;

            ListNode curr1 = headA;
            ListNode curr2 = headB;

            while (l2 > 0) {
                curr2 = curr2.next;
                l2--;
            }

            while (curr1 != null && curr2 != null) {
                if (curr1 == curr2) return curr1;
                curr1 = curr1.next;
                curr2 = curr2.next;
            }

            return null;
        }
    }
}