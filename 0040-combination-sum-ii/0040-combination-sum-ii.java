class Solution {
    public static void getAllCombinations(int index, List<Integer> list, List<List<Integer>> ans, int[] candidates, int target){
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int i = index;i < candidates.length;i++){
            if(i > index && candidates[i] == candidates[i - 1]) continue;
            if(candidates[i] > target) break;
            
            list.add(candidates[i]);
            getAllCombinations(i+1, list, ans, candidates, target - candidates[i]);
            list.remove(list.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        getAllCombinations(0, list, ans, candidates, target);
        return ans;
    }
}