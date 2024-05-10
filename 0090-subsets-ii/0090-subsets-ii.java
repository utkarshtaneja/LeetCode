class Solution {
    public static void getAllSubsets(int index, List<Integer> list, List<List<Integer>> ans, int[] nums){
        ans.add(new ArrayList<>(list));
        
        for(int i = index;i < nums.length;i++){
            if(i > index && nums[i] == nums[i - 1]) continue;
            
            list.add(nums[i]);
            getAllSubsets(i + 1, list, ans, nums);
            list.remove(list.size() - 1);
        }
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        getAllSubsets(0, new ArrayList<>(), ans, nums);
        return ans;
    }
}