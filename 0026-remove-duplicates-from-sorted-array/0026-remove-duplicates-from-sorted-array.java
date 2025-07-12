class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int index = 0;
        int count = 0;
        for(int i = 0;i < n;i++){
            if(set.contains(nums[i])){
                count++;
            }
            else{
                set.add(nums[i]);
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}