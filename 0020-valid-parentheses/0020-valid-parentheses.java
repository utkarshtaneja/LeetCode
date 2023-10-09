class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n == 0 || n == 1){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }
            else if(ch == '(' || ch == '[' || ch == '{' ){
                st.push(ch);
            }
            else if( (ch == ')' && st.peek() == '(') || 
                     (ch == ']' && st.peek() == '[') || 
                     (ch == '}' && st.peek() == '{') ){
                        st.pop();
            }
            else{
                st.push(ch);
            }
        }
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}