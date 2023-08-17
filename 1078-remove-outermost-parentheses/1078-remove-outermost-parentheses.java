class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        int count = 0; // to check for open parenthesis
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                if (count > 0) {
                    ans.append(ch);
                }
                count++;
            } 
            else if (ch == ')') {
                count--;
                if (count > 0) {
                    ans.append(ch); 
                }
            }
        }
        
        return ans.toString();
    }
}
