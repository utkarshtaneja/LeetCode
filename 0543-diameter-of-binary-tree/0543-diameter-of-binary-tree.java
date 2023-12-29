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
    public static int height(TreeNode root){
        if(root == null) return 0;
        int leftDepth = height(root.left);
        int rightDepth = height(root.right);
        int ans = Math.max(leftDepth,rightDepth) + 1;
        return ans;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int Ls = diameterOfBinaryTree(root.left);
        int Rs = diameterOfBinaryTree(root.right);
        int diam = height(root.left) + height(root.right) ;
        int ans = Math.max(Ls,Rs);
        return Math.max(ans,diam);
    }
}