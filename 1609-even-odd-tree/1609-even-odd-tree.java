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
class Solution{
    public static boolean checkIncreasing(ArrayList<Integer> li){
        int n = li.size();
        int prev = li.get(0);
        for(int i = 1;i < n;i++){
            if(li.get(i) <= prev || (li.get(i) % 2 == 0 && li.get(i-1) % 2 == 1)){
                return false;
            }
            prev = li.get(i);
        }
        return true;
    }
    public static boolean checkDecreasing(ArrayList<Integer> li){
        int n = li.size();
        int prev = li.get(0);
        for(int i = 1;i < n;i++){
            if(li.get(i) >= prev || (li.get(i) % 2 == 0 && li.get(i-1) % 2 == 1)){
                return false;
            }
            prev = li.get(i);
        }
        return true;
    }
    public boolean isEvenOddTree(TreeNode root) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(root == null) {
            return false;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> temp = new ArrayList<>();

            for(int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
                temp.add(curr.val);
            }
            list.add(temp);
        }

        int n = list.size();
        for(int i = 0; i < n; i++) {
            ArrayList<Integer> li = list.get(i);
            if(i % 2 == 0) {
                if(!checkIncreasing(li)) {
                    return false;
                }
                for(int num : li) {
                    if(num % 2 != 1) {
                        return false;
                    }
                }
            } 
            else {
                if(!checkDecreasing(li)) {
                    return false;
                }
                for(int num : li) {
                    if(num % 2 != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}