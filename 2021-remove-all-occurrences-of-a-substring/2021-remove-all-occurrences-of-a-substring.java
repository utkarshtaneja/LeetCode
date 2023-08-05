class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder ans = new StringBuilder();
        int l = s.length();
        int m = part.length();
        int n = 0;

        for(int i = 0;i<l;i++){
            char ch = s.charAt(i);

            n = ans.length();

            if(n >= m && ans.substring(n - m).equals(part)){
                ans.setLength(n - m);
            }
            ans.append(ch);
        }
        
        n = ans.length();
        if(n >= m && ans.substring(n - m).equals(part)){
            ans.setLength(n - m);
        }
        return ans.toString();
    }
}