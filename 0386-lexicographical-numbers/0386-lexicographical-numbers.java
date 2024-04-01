class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> list = new ArrayList<>();
        for(int i = 1;i <= n;i++){
            list.add(String.valueOf(i));
        }
        Collections.sort(list);
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i < list.size();i++){
            int val = Integer.parseInt(list.get(i));
            ans.add(val);
        }
        return ans;
    }
}