class Solution {
    public double myPow(double x, int n) {
        // Without Recursion
        long e = n;
        while (e < 0) {
            x = 1/ x;
            e = -e;
        }
        double ans = 1.0;

        while (e > 0) {
            if((e & 1) == 1) {
                ans *= x;
            }
            x *= x;
            e = e >> 1;
        }

        return ans;
    }
}