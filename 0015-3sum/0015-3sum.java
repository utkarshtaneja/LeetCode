class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // BRUTE FORCE SOLUTION
        // Set<List<Integer>> st = new HashSet<>();
        // int n = nums.length;
        // List<Integer> list = new ArrayList<>();
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         for (int k = j + 1; k < n; k++) {
        //             if(nums[i] + nums[j] + nums[k] == 0) {
        //                 List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
        //                 temp.sort(null);
        //                 st.add(temp);
        //             }
        //         }
        //     }
        // }
        // List<List<Integer>> ans = new ArrayList<>(st);
        // return ans;



        // BETTER SOLUTION
        // int n = nums.length;
        // Set<List<Integer>> ans = new HashSet<>();
        // for(int i = 0;i<n;i++){
        //     Set<Integer> set = new HashSet<>();
        //     for(int j = i+1;j<n;j++){
        //         int third = - (nums[i] + nums[j]);
        //         if(set.contains(third)){
        //             List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
        //             temp.sort(null);
        //             ans.add(temp);
        //         }
        //         set.add(nums[j]);
        //     }
        // }
        // List<List<Integer>> result = new ArrayList<>(ans);
        // return result;



        // OPTIMIZED SOLUTION
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            
            if(i != 0 && nums[i] == nums[i - 1]){
                continue;
            }

            int j = i + 1;
            int k = n - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0) {
                    j++;
                } 
                else if(sum > 0) {
                    k--;
                } 
                else {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j - 1]){
                        j++;
                    }
                    while(j < k && nums[k] == nums[k + 1]){
                        k--;
                    }
                }
            }
        }

        return ans;
    }
}