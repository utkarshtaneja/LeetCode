class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> parenthesis = new Stack<>();
        Stack<Integer> star = new Stack<>();
        
        int n = s.length();
        for(int i = 0;i < n;i++){
            char ch = s.charAt(i);
            
            if(ch == '('){
                parenthesis.push(i);
            }
            else if(ch == '*'){
                star.push(i);
            }
            else if(ch == ')'){
                if(!parenthesis.empty()){
                    parenthesis.pop();
                }
                else if(!star.isEmpty()){
                    star.pop();
                }
                else{
                    return false;
                }
            }
        }
        
        while(!parenthesis.isEmpty() && !star.isEmpty()){
            if(parenthesis.pop() > star.pop()){
                return false;
            }
        }
        return parenthesis.isEmpty();
    }
}