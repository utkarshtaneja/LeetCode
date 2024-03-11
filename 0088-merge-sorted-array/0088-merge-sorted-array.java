class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Brute Force
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i = 0;i < m;i++){
        //     if(nums1[i] != 0){
        //         list.add(nums1[i]);
        //     }
        // }
        // for(int i = 0;i < n;i++){
        //     list.add(nums2[i]);
        // }
        // Collections.sort(list);
        // for(int i = 0;i < list.size();i++){
        //     nums1[i] = list.get(i);
        // }
        
        // Optimal
        int[] merged = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
    
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } 
            else {
                merged[k++] = nums2[j++];
            }
        }
    
        while (i < m) {
            merged[k++] = nums1[i++];
        }
    
        while (j < n) {
            merged[k++] = nums2[j++];
        }

        for (int p = 0; p < m + n; p++) {
            nums1[p] = merged[p];
        }
    }
}