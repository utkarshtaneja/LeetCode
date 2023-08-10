class Solution {
    public int mySqrt(int x) {
        long s = 1;
        long e = x;
        long ans = 0;
        
        while(s<=e){
            long mid = s + (e-s) / 2;
            if(mid * mid <= x){
                ans = (int)mid;
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return (int)(ans);
    }
}