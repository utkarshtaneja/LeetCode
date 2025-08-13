class Solution {
    public static double power(double x, long n) {
        if (n == 0) return 1.0; 
        double half = power(x, n / 2);
        
        if (n % 2 == 0) {
            return half * half;
        } 
        else {
            return half * half * x;
        }
    }
    public double myPow(double x, int n) {
        // Without Recursion
        // long e = n;
        // while (e < 0) {
        //     x = 1/ x;
        //     e = -e;
        // }
        // double ans = 1.0;

        // while (e > 0) {
        //     if((e & 1) == 1) {
        //         ans *= x;
        //     }
        //     x *= x;
        //     e = e >> 1;
        // }

        // return ans;

        // With recursion
        long exp = n;
        if (n < 0) {
            x = 1 / x;
            exp = -exp;
        }
        return power(x, exp);
    }
}