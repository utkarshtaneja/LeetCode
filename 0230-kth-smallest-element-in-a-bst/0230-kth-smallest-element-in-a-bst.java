/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return list;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
        return list;
    }
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        
        for(int i = 0 ;i < list.size();i++){
            minHeap.add(list.get(i));
        }
        
        for(int i = 0;i < k-1;i++){
            minHeap.poll();
        }
        return minHeap.poll();
    }
}