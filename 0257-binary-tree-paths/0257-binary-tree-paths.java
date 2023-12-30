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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        ArrayList<Integer> pathList = new ArrayList<>();
        printRoot2Leaf(root, pathList, result);
        return result;
    }
    private static void printPath(ArrayList<Integer> list, List<String> result) {
        StringBuilder path = new StringBuilder();
        for(int i = 0; i < list.size(); i++) {
            path.append(list.get(i));
            if(i < list.size() - 1) {
                path.append("->");
            }
        }
        result.add(path.toString());
    }

    private static void printRoot2Leaf(TreeNode root,ArrayList<Integer> list,List<String> result) {
        if(root == null) return;

        list.add(root.val);

        if(root.left == null && root.right == null) {
            printPath(list, result);
        } 
        else {
            printRoot2Leaf(root.left, list, result);
            printRoot2Leaf(root.right, list, result);
        }

        list.remove(list.size() - 1);
    }
}