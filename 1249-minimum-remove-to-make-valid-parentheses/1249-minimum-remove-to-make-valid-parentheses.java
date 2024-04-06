class Solution {
    public String minRemoveToMakeValid(String s) {
        Set<Integer> set = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                st.push(i);
            } 
            else if(ch == ')') {
                if(st.isEmpty()) {
                    set.add(i);
                } 
                else {
                    st.pop();
                }
            }
        }
        
        while(!st.isEmpty()) {
            set.add(st.pop());
        }
        
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(!set.contains(i)) {
                result.append(s.charAt(i));
            }
        }
        
        return result.toString();
    }
}