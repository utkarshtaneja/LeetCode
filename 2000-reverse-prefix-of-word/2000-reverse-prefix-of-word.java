class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder ans = new StringBuilder();
        int index = -1;
        for(int i = 0;i < word.length();i++){
            char curr = word.charAt(i);
            if(curr == ch){
                ans.append(curr);
                index = i + 1;
                break;
            }
            ans.append(curr);
        }
        if(index == -1){
            return ans.toString();
        }
        ans.reverse();
        while(index < word.length()){
            ans.append(word.charAt(index));
            index++;
        }
        return ans.toString();
    }
}