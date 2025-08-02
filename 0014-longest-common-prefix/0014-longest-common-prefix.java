class Solution {
    public static String compare(String word1, String word2) {
        int n = Math.min(word1.length(), word2.length());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (word1.charAt(i) == word2.charAt(i)) {
                result.append(word1.charAt(i));
            } 
            else {
                break;
            }
        }

        return result.toString();
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            prefix = compare(prefix, strs[i]);
            if (prefix.isEmpty()) break;
        }

        return prefix;
    }
}