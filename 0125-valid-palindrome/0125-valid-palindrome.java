class Solution {
    public static String reverse(String str){
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        return rev.toString();
    }
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return false;
        }
        else{
            StringBuilder str = new StringBuilder();
            int n = s.length();
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (Character.isLetterOrDigit(ch)) { 
                    str.append(Character.toLowerCase(ch));
                }
            }

            String ans = reverse(str.toString());

            return str.toString().equals(ans);
        }
    }
}
