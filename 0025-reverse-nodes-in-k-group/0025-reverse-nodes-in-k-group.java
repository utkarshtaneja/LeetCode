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
    public static ListNode reverse(ListNode head, ListNode tail) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != tail) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
    public static ListNode getKthNode(ListNode temp, int k) {
        k--;
        while (temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            ListNode kth = getKthNode(temp, k);
            if (kth == null) {
                if (prev != null) {
                    prev.next = temp;
                }
                break;
            }
            ListNode nextNode = kth.next;
            ListNode newHead  = reverse(temp, nextNode);
            if (temp == head) {
                head = newHead;
            }
            else {
                prev.next = newHead;
            }
            prev = temp;
            temp = nextNode;
        }

        return head;
    }
}