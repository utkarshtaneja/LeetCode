class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int ans = 0;

        if(n == 1){
            return nums[0];
        }

        if(nums[0] != nums[1]){
            return nums[0];
        }

        if(nums[n-1] != nums[n-2]){
            return nums[n-1];
        }

        int low = 0;
        int high = n - 1;

        while(low <= high){
            int mid = (low + high) / 2;

            boolean isEven = (high - mid) % 2 == 0;
            if (mid > 0 && nums[mid] == nums[mid - 1]) {
                if (isEven) {
                    high = mid - 2;
                } 
                else {
                    low = mid + 1;
                }
            } 
            else if (mid < n - 1 && nums[mid] == nums[mid + 1]) {
                if (isEven) {
                    low = mid + 2;
                } 
                else {
                    high = mid - 1;
                }
            } 
            else {
                return nums[mid];
            }
        }
        return ans;
    }
}