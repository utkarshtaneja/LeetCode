class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        StringBuilder ans = new StringBuilder();
        boolean flag = true;
        int i = 0;
        int j = 0;

        while(i < l1 && j < l2){
            if(flag){
                ans.append(word1.charAt(i));
                i++;
            }
            else{
                ans.append(word2.charAt(j));
                j++;
            }  
            flag = !flag;  
        }

        while(i < l1){
            ans.append(word1.charAt(i));
            i++;
        }

        while(j < l2){
            ans.append(word2.charAt(j));
            j++;
        }

        return ans.toString();
    }
}