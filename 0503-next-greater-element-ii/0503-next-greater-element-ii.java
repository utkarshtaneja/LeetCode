class Solution {
    // Using array
    public static int find(int[] nums,int index){
        int n = nums.length;
        for(int i = index;i < n-1;i++){
            if(nums[i+1] > nums[index]){
                return nums[i+1];
            }
        }
        for(int i = 0;i < index;i++){
            if(nums[i] > nums[index]){
                return nums[i];
            }
        }
        return -1;
    }
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i = 0;i < n;i++){
            ans[i] = find(nums,i);
        }
        return ans;
    }
    // Using Stack
//     int n = nums.length;
//         int ans[] = new int[n];
//         Stack<Integer> st = new Stack<>();
//         for(int i = 2 * n - 1; i >= 0; i--) {
//             int num = nums[i % n];
//             while(!st.isEmpty() && st.peek() <= num) {
//                 st.pop();
//             }
//             if(i < n) {
//                if(st.isEmpty()) {
//                     ans[i] = -1;
//                 } 
//                 else{
//                     ans[i] = st.peek();
//                 }
//             }
//             st.push(nums[i % n]); 

//         }
//         return ans;
}