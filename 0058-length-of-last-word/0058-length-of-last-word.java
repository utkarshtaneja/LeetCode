class Solution {
    public int lengthOfLastWord(String s) {
        // OPTIMIZED APROACH

        // int len = 0;
        // int i = s.length() - 1;
        // while(i>=0 && s.charAt(i) == ' '){
        //     i--;
        // }

        // while(i>=0 && s.charAt(i) != ' '){
        //     len++;
        //     i--;
        // }
        // return len;

        // MY APPROACH

        int ans = 0;
        int prev_ans = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                ans++;
                prev_ans = ans;
            }
            else{
                prev_ans = Math.max(prev_ans,ans);
                ans = 0;
            }
        }

        ans = Math.max(prev_ans,ans);
        return ans;
    }
}