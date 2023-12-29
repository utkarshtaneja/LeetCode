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
// class Solution {
//     public static int height(TreeNode root){
//         if(root == null) return 0;
//         int leftDepth = height(root.left);
//         int rightDepth = height(root.right);
//         int ans = Math.max(leftDepth,rightDepth) + 1;
//         return ans;
//     }
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root == null) return 0;
//         int Ls = diameterOfBinaryTree(root.left);
//         int Rs = diameterOfBinaryTree(root.right);
//         int diam = height(root.left) + height(root.right) ;
//         int ans = Math.max(diam,Math.max(Ls,Rs));
//         return ans;
//     }
// }

// Optimal Approach
class Solution {
    static class TreeInfo{
        int height;
        int diameter;
        
        TreeInfo(int height,int diameter){
            this.height = height;
            this.diameter = diameter;
        }
    }
    public static TreeInfo diameterOfTree(TreeNode root){
        if(root == null) return new TreeInfo(0,0); 
        TreeInfo left = diameterOfTree(root.left);
        TreeInfo right = diameterOfTree(root.right);
        
        int myHeight = Math.max(left.height,right.height) + 1;
        int diam1 = left.diameter;
        int diam2 = right.diameter;
        int diam3 = left.height + right.height ;
        
        int mydiam = Math.max(Math.max(diam1,diam2),diam3);
        TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
        return myInfo;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        TreeInfo info = diameterOfTree(root);
        return info.diameter;
    }
}
