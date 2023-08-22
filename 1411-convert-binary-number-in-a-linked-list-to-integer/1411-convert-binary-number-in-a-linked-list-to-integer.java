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
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        ListNode temp = head;
        int length = length(head);
    
        while(temp != null){
            int rem = temp.val;
            length--;
            if(rem == 1){
                ans = ans + (int)(Math.pow(2, length));
            }
            temp = temp.next;
        }
        return ans;
    }
}