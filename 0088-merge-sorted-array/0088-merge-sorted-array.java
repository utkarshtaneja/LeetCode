class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0;i<m;i++){
            nums1[i] = nums1[i];
        }
        for(int i = 0;i<n;i++){
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}