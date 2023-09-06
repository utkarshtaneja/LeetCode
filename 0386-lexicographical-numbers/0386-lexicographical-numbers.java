class Solution {
    public List<Integer> lexicalOrder(int n) {
        // Using iteration
        List<Integer> result = new ArrayList<>();
        int curr = 1;
        
        for(int i = 1; i <= n; i++) {
            result.add(curr);
            
            if (curr * 10 <= n) {
                curr *= 10;
            } 
            else if (curr % 10 != 9 && curr + 1 <= n) {
                curr++;
            } 
            else {
                while ((curr / 10) % 10 == 9) {
                    curr /= 10;
                }
                curr = curr / 10 + 1;
            }
        }
        
        return result;
    }
}
