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
 
// Brute Force Method
// class Solution {
//     public static int length(ListNode head){
//         int count = 0;
//         while(head != null){
//             count++;
//             head = head.next;
//         }
//         return count;
//     }
//     public static void reverse(int s,int e,int[] arr){
//         while(s <= e){
//             int temp = arr[s];
//             arr[s] = arr[e];
//             arr[e] = temp;
//             s++;
//             e--;
//         }
//     }
//     public ListNode rotateRight(ListNode head, int k) {
//         if(head == null) {
//             return head;
//         }
//         int l = length(head);
//         ListNode temp = head;
//         int[] arr = new int[l];
//         for(int i = 0;i<l;i++){
//             arr[i] = temp.val;
//             temp = temp.next;
//         }
//         if(k == 0) {
//             return head;
//         }
//         k = k % l-1;
//         reverse(0,l-1,arr);

//         reverse(0,k,arr);

//         reverse(k+1,l-1,arr);
//         temp = head;
//         int index = 0;
//         while(temp != null){
//             temp.val = arr[index];
//             index++;
//             temp = temp.next;
//         }
//         return head;
//     }
// }

// Optimal Approach
class Solution{
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0 ){
            return head;
        }
        int len = 1;
        ListNode curr = head;
        while(curr.next != null){
            ++len;
            curr = curr.next;
        }
        curr.next = head;
        k = k % len;
        k = len - k;
        while(k > 0){
            curr = curr.next;
            k--;
        }
        head = curr.next;
        curr.next = null;
        return head;
    }
}