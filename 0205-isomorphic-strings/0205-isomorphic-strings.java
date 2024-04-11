class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        
        if(n1 != n2) return false;
        HashMap<Character, Character> map = new HashMap<>();
        
        for(int i = 0;i < n1;i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            
            if(map.containsKey(ch1)){
                if(map.get(ch1) != ch2){
                    return false;
                }
            }
            else{
                if(map.containsValue(ch2)){
                   return false;
                }
                map.put(ch1, ch2);
            }
        }
        
        return true;
    }
}