class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);

            if (charIndexMap.containsKey(ch)) {
                left = Math.max(left, charIndexMap.get(ch) + 1);
            }

            charIndexMap.put(ch, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}