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
    public static ArrayList<Integer> Inorder(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return list;
        }
        Inorder(root.left, list);
        list.add(root.val);
        Inorder(root.right, list);
        return list;
    }
    
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        Inorder(root, list);
        
        for(int i = 0;i < list.size();i++){
            minHeap.add(list.get(i));
        }
        
        for(int i = 0;i < k-1;i++){
            minHeap.poll();
        }
        return minHeap.poll();
    }
}