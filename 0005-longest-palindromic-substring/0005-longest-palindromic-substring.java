class Solution {
    public static boolean check(String s) {
        int start = 0;
        int end = s.length() - 1;
        while(start <= end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        
        if(n <= 1) {
            return s;
        }

        int max_len = 1;
        int start = 0;
        int end = 0;

        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                String sub = s.substring(i, j + 1);
                if(check(sub) && sub.length() > max_len) {
                    max_len = sub.length();
                    start = i;
                    end = j;
                }
            }
        }
        
        return s.substring(start, end + 1);
    }
}
