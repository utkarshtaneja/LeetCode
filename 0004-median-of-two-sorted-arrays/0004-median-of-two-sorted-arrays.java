class Solution {
    public static int[] combine(int[] nums1, int[] nums2, int n1, int n2) {
        int i = 0, j = 0, k = 0;
        int[] merged = new int[n1 + n2];

        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        while (i < n1) {
            merged[k++] = nums1[i++];
        }

        while (j < n2) {
            merged[k++] = nums2[j++];
        }

        return merged;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;   
        int n2 = nums2.length; 

        int[] combined = combine(nums1, nums2, n1, n2);
        int totalLength = n1 + n2;

        if (totalLength % 2 == 1) {
            return (double) combined[totalLength / 2];
        } 
        else {
            int mid1 = combined[totalLength / 2 - 1];
            int mid2 = combined[totalLength / 2];
            return (mid1 + mid2) / 2.0;
        }
    }
}
