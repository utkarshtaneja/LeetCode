class Solution {
    public static int addition(int[] nums,int index){
        int sum = 0;
        for(int i = index;i>=0;i--){
            sum = sum + nums[i];
        }
        return sum;
    }
    public int[] runningSum(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0;i<nums.length;i++){
            int val = addition(nums,i);
            list.add(val);
        }
        int[] ans = new int[list.size()];
        for(int i = 0;i<ans.length;i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}