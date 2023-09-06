class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int n = s.length();
        if(n == 0) {
            return 0;
        }

        String temp = "";
        int sign = 1;

        int index = 0;
        if(s.charAt(0) == '-' || s.charAt(0) == '+'){
            if(s.charAt(0) == '-'){
                sign = -1;
            }
            else{
                sign = 1;
            }
            index++;
        }

        for (int i = index; i < n; i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) {
                temp = temp + ch;
            } 
            else{
                break; 
            }
        }

        if (temp.isEmpty()) {
            return 0; 
        }

        try{
            int ans = Integer.parseInt(temp);
            return ans * sign;
        }
        catch(NumberFormatException e) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
    }
}