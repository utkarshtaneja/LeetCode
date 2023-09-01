class Solution {
    public static boolean isPossible(int[] nums,int divisor,int threshold){
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Math.ceil((double) nums[i] / divisor);
        }
        return sum <= threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {

        int low = 1;
        int high = Integer.MAX_VALUE;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(isPossible(nums,mid,threshold)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}