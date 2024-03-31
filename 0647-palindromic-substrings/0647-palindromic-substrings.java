class Solution {
    public static boolean check(int start, int end, String s){
        while(start <= end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0;i < s.length();i++){
            for(int j = i ;j < s.length();j++){
                if(check(i, j, s)){
                    count++;
                }
            }
        }
        return count;
    }
}