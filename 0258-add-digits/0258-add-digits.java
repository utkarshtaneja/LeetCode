class Solution {
    public int addDigits(int num) {
        int rem = 0;
        int ans = 0;
        while(num > 0){
            rem = num % 10;
            num = num / 10;
            ans = ans + rem;
        }
        if(ans > 9){
            return addDigits(ans);
        }
        return ans;   
    }
}