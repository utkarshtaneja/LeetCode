class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Brute Force
        // Set<List<Integer>> st = new HashSet<>();
        // int n = nums.length;
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

        // Better
        // int n = nums.length;
        // Set<List<Integer>> set = new HashSet<>();
        // for (int i = 0;i < n;i++) {
        //     Set<Integer> collect = new HashSet<>();
        //     for (int j = i + 1;j < n;j++) {
        //         int rem = -(nums[i] + nums[j]);
        //         if (collect.contains(rem)) {
        //             List<Integer> temp = Arrays.asList(nums[i], nums[j], rem);
        //             Collections.sort(temp);
        //             set.add(new ArrayList<>(temp));
        //         }
        //         collect.add(nums[j]);
        //     }
        // }
        // List<List<Integer>> ans = new ArrayList<>(set);
        // return ans;

        // Best
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0;i < n;i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;   
                }
                else if (sum > 0) {
                    k--;
                }
                else{
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(new ArrayList<>(temp));
                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        return ans;
    }
}