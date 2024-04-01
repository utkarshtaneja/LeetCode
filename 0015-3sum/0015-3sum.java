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
        
        for(int i = 0;i < n -2;i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                int s = i + 1;
                int e = n - 1;
                
                while(s < e){
                    int sum = nums[i] + nums[s] + nums[e];
                    if(sum == 0){
                        ans.add(Arrays.asList(nums[i], nums[s], nums[e]));
                        
                        while(s < e && nums[s] == nums[s+1]) s++;
                        while(s < e && nums[e] == nums[e-1]) e--;
                        
                        s++;
                        e--;
                    }
                    else if(sum < 0){
                        s++;
                    }
                    else{
                        e--;
                    }
                }
            }
        }
        return ans;
    }
}