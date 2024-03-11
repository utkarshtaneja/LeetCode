class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        boolean flag = false;
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() > max){
                max = e.getValue();
            }
        }
        int sum = 0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() == max){
                sum += e.getValue();
            }
        }
        return sum;
    }
}