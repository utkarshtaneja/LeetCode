class Solution {
    public static int findDays(int[] weights,int capacity){
        int days = 1; 
        int load = 0;
        int n = weights.length; 
        for (int i = 0; i < n; i++) {
            if (load + weights[i] > capacity) {
                days++; 
                load = weights[i]; 
            } 
            else {
                load += weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for (int i = 0; i < weights.length; i++) {
            high = high + weights[i];   // summation
            low = Math.max(low, weights[i]);    // max value
        }

        // Range = (maxValue , summation)
        while (low <= high) {
            int mid = (low + high) / 2;
            int numberOfDays = findDays(weights, mid);
            if (numberOfDays <= days) {
                //eliminate right half
                high = mid - 1;
            } 
            else {
                //eliminate left half
                low = mid + 1;
            }
        }
        return low;

        
    }
}