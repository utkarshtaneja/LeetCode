class Solution {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;
        // reverse
        rev(0,nums.length-1,nums);

        // reverse first k elements
        rev(0,k-1,nums);

        // reverse after k elements
        rev(k,nums.length-1,nums);
        
         
    }
    private static void rev(int s,int e,int[] nums){

        while(s<e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}