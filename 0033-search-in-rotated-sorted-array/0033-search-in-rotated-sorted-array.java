class Solution {
    private static int bs(int[] nums,int start,int end,int target){
        int s = start;
        int e = end;

        int mid = s + (e-s)/2;
        while(s<=e){
            if(nums[mid] == target){
                return mid;
            }
            else if(target > nums[mid]){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
            mid = s + (e-s)/2;
        }
        return -1;
    }

    private static int pivot(int[] nums){
        int s = 0;
        int e = nums.length - 1;
        int mid = s + (e-s)/2;

        while(s<e){
            
            if(nums[mid] >= nums[0]){
                s = mid + 1;
            }
            else{
                e = mid;
            }
            mid = s + (e-s)/2;
        }
        return s;
    }
    public int search(int[] nums, int target) {
        int p = pivot(nums);

        if(target >= nums[p] && target <= nums[nums.length - 1]){
            // Bs in second line
            return bs(nums,p,nums.length - 1,target);
        }
        else{
            // Bs in first line
            return bs(nums,0,p-1,target);
        }
    }
}