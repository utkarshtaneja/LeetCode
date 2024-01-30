class Solution {
    public List<Integer> lexicalOrder(int n) {
        // Brute Force
        // List<String> list = new ArrayList<>();
        // for(int i = 1;i <= n;i++){
        //     list.add(String.valueOf(i));
        // }
        // Collections.sort(list);
        // return list.stream().map(Integer::parseInt).collect(Collectors.toList());
        
        // optimal
        List<Integer> list = new ArrayList<>();
        for(int i = 1;i < 10;i++){
            dfs(i, n, list);
        }
        return list;
    }
    private static void dfs(int curr,int n,List<Integer> list){
        if(curr > n){
            return;
        }
        else{
            list.add(curr);
            for(int i = 0;i < 10;i++){
                if(10 * curr + i > n){
                    return;
                }
                dfs(10* curr + i ,n,list);
            }
        }
    }
}