class Solution {
    // Using iteration
    public List<Integer> lexicalOrder(int n) {
        // List<Integer> result = new ArrayList<>();
        // int curr = 1;
        
        // for(int i = 1; i <= n; i++) {
        //     result.add(curr);
            
        //     if (curr * 10 <= n) {
        //         curr *= 10;
        //     } 
        //     else if (curr % 10 != 9 && curr + 1 <= n) {
        //         curr++;
        //     } 
        //     else {
        //         while ((curr / 10) % 10 == 9) {
        //             curr /= 10;
        //         }
        //         curr = curr / 10 + 1;
        //     }
        // }
        
        // return result;

        
        List<Integer> result = new ArrayList<>();
        dfs(0, n, result);
        return result;
    }

    // Using recursion
    private void dfs(int current, int n, List<Integer> result) {
        if(current > 0) {
            result.add(current);
        }
        if(current * 10 <= n) {
            for(int i = 0; i <= 9; i++) {
                if(current == 0 && i == 0) {
                    continue; 
                }
                int next = current * 10 + i;
                if(next <= n) {
                    dfs(next, n, result);
                } 
                else{
                    break;
                }
            }
        }
    }
}
