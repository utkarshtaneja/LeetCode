class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n = s.length();
        int maxLength = 0;
        int i = 0,j = 0;
        unordered_set<char> set;

        while (i < n && j < n) {
            if (set.find(s[j]) == set.end()) {
                set.insert(s[j++]);
                maxLength = max(maxLength, j - i);
            } 
            else {
                set.erase(s[i++]);
            }
        }

        return maxLength;
    }
};