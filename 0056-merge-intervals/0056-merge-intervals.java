class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int[] newInterval = intervals[0];
        List<int[]> ans = new ArrayList<>();
        ans.add(newInterval);
        
        for(int[] x : intervals){
            if(x[0] <= newInterval[1]){
                newInterval[1] = Math.max(x[1], newInterval[1]);
            }
            else{
                newInterval = x;
                ans.add(newInterval);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}