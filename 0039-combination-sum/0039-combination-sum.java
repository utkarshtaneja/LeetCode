class Solution {
    public static void getAllCombinations(int index, int[] arr,List<Integer> list ,List<List<Integer>> ans, int target){
        if(index == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        
        // pick
        if(arr[index] <= target){
            list.add(arr[index]);
            getAllCombinations(index, arr, list, ans, target - arr[index]);
            list.remove(list.size() - 1);
        }
        
        // Not pick
        getAllCombinations(index + 1, arr, list, ans, target);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        getAllCombinations(0, candidates, list, ans, target);
        return ans;
    }
}