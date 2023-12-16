class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        if(s.length() == 1 && t.length() == 1){
            return s.charAt(0) == t.charAt(0);
        }
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        int n =  Math.max(s.length(),t.length());
        for(int i = 0;i < n;i++){
            if(ch1[i] != ch2[i]){
                return false;
            }
        }
        return true;
    }
}