class Solution {
    public static int[] merge(int[] nums1, int[] nums2){
        int[] merged = new int[nums1.length + nums2.length];
        
        int i = 0;  
        int j = 0;  
        int k = 0;
        
        while(i != nums1.length && j != nums2.length){
            if(nums1[i] < nums2[j]){
                merged[k] = nums1[i];
                k++;
                i++;
            }
            else{
                merged[k] = nums2[j];
                k++;
                j++;
            }
        }
        
        while(i != nums1.length){
            merged[k] = nums1[i];
            k++;
            i++;
        }
        
        while(j != nums2.length){
            merged[k] = nums2[j];
            k++;
            j++;
        }
        
        return merged;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans = 0;
        int[] merged = merge(nums1, nums2);
        int n = merged.length;
        
        if(n % 2 == 0){
            int low = (n - 1) / 2;
            int high = n / 2;
            
            return (double)( (merged[low] + merged[high]) / 2.0 );
        }
        else{
            int mid = (n - 1) / 2;
            return (double)(merged[mid]);
        }
    }
}