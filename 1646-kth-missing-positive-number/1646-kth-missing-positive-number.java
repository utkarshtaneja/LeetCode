class Solution {
    public int findKthPositive(int[] arr, int k) {
        int maxi = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            maxi = Math.max(maxi,arr[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < maxi;i++){
            list.add(i+1);
        }

        for(int i = 0;i<arr.length;i++){
            if(list.contains(arr[i])){
                list.remove(Integer.valueOf(arr[i]));
            }
        }

        if (list.size() >= k) {
            return list.get(k - 1);
        } 
        else {
            return maxi + k - list.size();
        }
    }
}