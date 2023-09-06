class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int n = s.length();
        int prevValue = 0;

        for(int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int currentValue = 0;

            switch (ch) {
                case 'I':
                    currentValue = 1;
                    break;
                case 'V':
                    currentValue = 5;
                    break;
                case 'X':
                    currentValue = 10;
                    break;
                case 'L':
                    currentValue = 50;
                    break;
                case 'C':
                    currentValue = 100;
                    break;
                case 'D':
                    currentValue = 500;
                    break;
                case 'M':
                    currentValue = 1000;
                    break;
            }

            if (currentValue < prevValue) {
                ans -= currentValue;
            } 
            else {
                ans += currentValue;
            }

            prevValue = currentValue;
        }

        return ans;
    }
}
