class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        int sum = 0;
        int[] modCount = new int[k];
        modCount[0] = 1;
        
        for (int i = 0;i < n;i++){
            sum = (sum + nums[i]) % k;
            
            if (sum < 0) {
                sum += k;
            }
            
            count += modCount[sum]; 
            modCount[sum]++;
        }
        
        return count;
    }
}