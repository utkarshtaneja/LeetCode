class Solution {
    public boolean check(int[] nums) {
        // int n = nums.length;
        // boolean flag = true;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++){
        //         if (nums[j] < nums[i]) {
        //             flag = false;
        //             break;
        //         }
        //     }
        // }
        // return flag;

        int n = nums.length;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]){
                count++;
            }
        }

        if (count > 1) {
            return false;
        }

        if (count == 1) {
            return nums[0] >= nums[n - 1];
        }
        
        return true;
    }
}