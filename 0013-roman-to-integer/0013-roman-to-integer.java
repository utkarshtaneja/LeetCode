class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'I') {
                if (i + 1 < n && ( s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')) {
                    ans -= 1;
                } 
                else {
                    ans += 1;
                }
            } 
            else if (ch == 'V') {
                ans += 5;
            } 
            else if (ch == 'X') {
                if (i + 1 < n && ( s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')) {
                    ans -= 10;  
                } 
                else {
                    ans += 10;
                }   
            } 
            else if (ch == 'L') {
                ans += 50;
            } 
            else if (ch == 'C') {
                if (i + 1 < n && ( s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')) {
                    ans -= 100;  
                } 
                else {
                    ans += 100;
                }
            } 
            else if (ch == 'D') {
                ans += 500;
            } 
            else if (ch == 'M') {
                ans += 1000;
            }
        }
        return ans;
    }
}