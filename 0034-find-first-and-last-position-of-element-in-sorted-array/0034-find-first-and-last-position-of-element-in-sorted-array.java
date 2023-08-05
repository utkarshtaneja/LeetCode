class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s = first(nums,target);
        if(s == -1){
            return new int[]{-1,-1};
        }

        int e = last(nums,target);
        return new int[]{s,e};
    }

    private static int first(int[] nums,int target){
        int s = 0;
        int e = nums.length - 1;
        int mid = s + (e - s) / 2;
        int result = -1;

        while(s<=e){
            if(nums[mid] == target){
                result = mid;
                e = mid - 1;
            }
            else if(nums[mid] < target){
                s = mid + 1;
            }
            else if(nums[mid] > target){
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }

        return result;
    }

    private static int last(int[] nums,int target){
        int s = 0;
        int e = nums.length - 1;
        int mid = s + (e - s) / 2;
        int result = -1;

        while(s<=e){
            if(nums[mid] == target){
                result = mid;
                s = mid + 1;
            }
            else if(nums[mid] < target){
                s = mid + 1;
            }
            else if(nums[mid] > target){
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }

        return result;
    }
}