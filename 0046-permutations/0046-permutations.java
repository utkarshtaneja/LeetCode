class Solution {
    public static void generate(int index, List<Integer> list, List<List<Integer>> ans, int[] nums, boolean[] freq){
        if(list.size() == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int i = 0;i < nums.length;i++){
            if(!freq[i]){
                freq[i] = true;
                list.add(nums[i]);
                generate(i + 1, list, ans, nums, freq);
                list.remove(list.size() - 1);
                
                freq[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        Arrays.fill(freq, false);
        generate(0, new ArrayList<>(), ans, nums, freq);
        return ans;
    }
}