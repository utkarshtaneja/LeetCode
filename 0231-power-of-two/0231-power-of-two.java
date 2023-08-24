class Solution {
    public boolean isPowerOfTwo(int n) {
        int i = 0;
        if (n <= 0) {
            return false;
        }
        while(i <= n){
            int val = (int)(Math.pow(2,i));
            if(val >= Integer.MAX_VALUE || val > n){
                return false;
            }
            else if(n == val){
                return true;
            }
            i++;
        }
        return false;
    }
}