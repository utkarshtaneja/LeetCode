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
//     public ListNode reverseKGroup(ListNode head, int k) {
//         int l = length(head);
//         ListNode temp = head;
//         int[] arr = new int[l];
//         for(int i = 0;i<l;i++){
//             arr[i] = temp.val;
//             temp = temp.next;
//         }
//         int s = 0;
//         int e = k-1;
//         while(e < l){
//             reverse(s,e,arr);
//             s = e + 1;
//             e = s + k - 1;
            
//         }
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
class Solution {
    public static int length(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        ListNode nex = curr;
        ListNode prev = dummy;
        int count = 0;
        while(curr.next != null){
            count++;
            curr = curr.next;
        }
        while(count >= k){
            curr = prev.next;
            nex = curr.next;
            for(int i = 1;i<k;i++){
                curr.next = nex.next;
                nex.next = prev.next;
                prev.next = nex;
                nex = curr.next;
            }
            prev = curr;
            count = count - k;
        }
        return dummy.next;
    }
}