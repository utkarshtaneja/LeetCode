class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Brute Force Method
        // int n1 = nums1.length;
        // int n2 = nums2.length;
        // int[] ans = new int[n1];

        // for(int i = 0;i<ans.length;i++){
        //     ans[i] = -1;
        // }
        // for(int i = 0; i < n1; i++) {
        //     for(int j = 0; j < n2; j++) {
        //         if(nums1[i] == nums2[j]) {
        //             for(int k = j + 1; k < n2; k++) {
        //                 if(nums2[k] > nums2[j]) {
        //                     ans[i] = nums2[k];
        //                     break;
        //                 }
        //             }
        //             break;
        //         }
        //     }
        // }
        // return ans;

        // Optimal Approach
        Map<Integer, Integer> map= new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int num : nums2) {
            while(!st.isEmpty() && num > st.peek() ){
                map.put(st.pop(), num);
            }
            st.push(num);
        }

        for(int i = 0; i < nums1.length; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }

        return nums1;
    }
}