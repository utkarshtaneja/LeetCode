class Solution {
    public int getSum(int a, int b) {
        // Wrong way
        // return a + b;
        
        // Right way
        while (b != 0) {
            int carry = a & b; 
            a = a ^ b; 
            b = carry << 1;
        }
        return a;
    }
}