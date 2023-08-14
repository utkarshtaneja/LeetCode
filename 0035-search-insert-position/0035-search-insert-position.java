class Solution {
    public int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int index = target-1;
        boolean flag = false;

        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid] == target){
                index = mid;
                flag = true;
                break;
            }
            else if(target > nums[mid]){
                s = mid + 1;
            }
            else{
                e = mid-1;
            }
        }
        if(flag){
            return index;
        }
        else{
            return s;
        }
    }
}