class Solution {
    public static boolean check(String s){
        int start = 0;
        int end = s.length() - 1;
        
        while(start <= end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        String ans = "";
        for(int i = 0;i < words.length;i++){
            String temp = words[i];
            if(check(temp)){
                ans = temp;
                break;
            }
        }
        return ans;
    }
}