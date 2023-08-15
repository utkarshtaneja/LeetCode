class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        
        int s = 0;
        int e = n-1;

        while(s<=e){
            int mid = s + (e - s)/2;

            if(nums[mid] == target){
                return true;
            }

            else if(target > nums[mid]){
                s = mid + 1;
            }

            else{
                e = mid - 1;
            }
        }

        return false;
    }
}