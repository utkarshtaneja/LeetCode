class Solution {
    public int pivotInteger(int n) {
        int totalSum = n * (n + 1) / 2;
        int leftSum = 0;
        int rightSum = n * (n + 1) / 2;
        
        for(int i = 0; i < n; i++) {
            rightSum -= i + 1;
            if(leftSum == rightSum) {
                return i + 1;
            }
            leftSum += i + 1;
        }
        return -1;
    }
}