class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int rem = 0;
        int num = x;
        while(x>0){
            rem = x%10;
            x = x/10;
            rev = rev*10 + rem;
        }

        if(rev == num){
            return true;
        }
        else{
            return false;
        }
    }
}