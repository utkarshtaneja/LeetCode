class Solution {
    public int[][] merge(int[][] intervals) {
        // Brute Force
        // int n = intervals.length;
        // Arrays.sort(intervals, new Comparator<int[]>() {
        //     public int compare(int[] a, int[] b) {
        //         return a[0] - b[0];
        //     }
        // });
        
        // List<List<Integer>> ans = new ArrayList<>();
        // for (int i = 0;i < n;i++) {
        //     int start = intervals[i][0];
        //     int end = intervals[i][1];

        //     if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
        //         continue;
        //     }

        //     for (int j = i + 1; j < n; j++) {
        //         if (intervals[j][0] <= end) {
        //             end = Math.max(end, intervals[j][1]);
        //         } else {
        //             break;
        //         }
        //     }
        //     ans.add(Arrays.asList(start, end));
        // }
        // int[][] result = new int[ans.size()][2];
        // for (int i = 0;i < ans.size();i++) {
        //     result[i][0] = ans.get(i).get(0);
        //     result[i][1] = ans.get(i).get(1);
        // }
        // return result;

        // Optimal
        int n = intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } 
            else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}