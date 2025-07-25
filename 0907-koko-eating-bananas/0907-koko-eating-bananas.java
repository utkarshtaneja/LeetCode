class Solution {
    public static int getRequiredTime(int[] piles, int k) {
        int time = 0;
        for (int i = 0;i < piles.length;i++) {
            time += Math.ceil((piles[i] + k - 1) / k);
        }
        return time;
    }
    public static boolean isPossible(int[] piles, int k, int h) {
        int requiredTime = getRequiredTime(piles, k);
        if (requiredTime <= h) return true;
        return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        // Brute Force
        // int maxPile = 0;
        // for (int pile : piles) {
        //     maxPile = Math.max(maxPile, pile);
        // }

        // for (int k = 1; k <= maxPile; k++) {
        //     int requiredTime = getRequiredTime(piles, k);
        //     if (requiredTime <= h) {
        //         return k;
        //     }
        // }
        // return -1;

        // Optimal
        int low = 1;
        int high = Integer.MIN_VALUE;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int requiredTime = getRequiredTime(piles, mid);

            if (isPossible(piles, mid, h)) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
}