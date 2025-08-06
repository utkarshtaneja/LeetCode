class Solution {
    public static int getMin(int[] freq) {
        int ans = Integer.MAX_VALUE;
        for (int val : freq) {
            if(val > 0) ans = Math.min(ans, val);
        }
        return ans;
    }
    public static int getMax(int[] freq) {
        int ans = Integer.MIN_VALUE;
        for (int val : freq) {
            ans = Math.max(ans, val);
        }
        return ans;
    }
    public static int beautySum(String s) {
        int sum = 0;
        for (int i = 0;i < s.length();i++) {
            int[] freq = new int[26];
            for (int j = i;j < s.length();j++) {
                freq[s.charAt(j) - 'a']++;
                int beauty = getMax(freq) - getMin(freq);
                sum += beauty;
            }
        }
        return sum;
    }
}