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
    public ListNode sortList(ListNode head) {
        // Brute Force Method
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int[] arr = new int[size];
        temp = head;
        int index = 0;
        while(temp != null){
            arr[index] = temp.val;
            index++;
            temp = temp.next;
        }
        Arrays.sort(arr);
        temp = head;
        for(int i = 0;i<arr.length;i++){
            temp.val = arr[i];
            temp = temp.next;
        }
        return head;
    }
}