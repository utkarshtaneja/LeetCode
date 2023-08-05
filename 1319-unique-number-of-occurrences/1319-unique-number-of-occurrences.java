class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(map.containsKey(arr[i])){
                int incr = map.getOrDefault(arr[i],0) + 1;
                map.put(arr[i],incr);
            }
            else{
                map.put(arr[i],1);
            }
        }

        HashSet<Integer> set = new HashSet<>();
        boolean ans = true;
        for (int val : map.values()) {
            if (set.contains(val)) {
                ans = false;
                break;
            }
            set.add(val);
        }

        return ans;
    }
}