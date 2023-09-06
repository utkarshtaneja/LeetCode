class Solution {
    public static void outcomes(String digits, int i, String ans, List<String> list, String[] letters) {
        // base case
        if (i == digits.length()) {
            list.add(ans);
            return;
        }

        char ch = digits.charAt(i);
        int idx = ch - '0';
        String s = letters[idx];

        for (int j = 0; j < s.length(); j++) {
            outcomes(digits, i + 1, ans + s.charAt(j), list, letters);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        
        if(digits == null || digits.length() == 0) {
            return list;
        }

        String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        outcomes(digits, 0, "", list, letters);
        
        return list;
    }
}
