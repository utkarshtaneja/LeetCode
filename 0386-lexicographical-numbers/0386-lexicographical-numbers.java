class Solution {
    public List<Integer> lexicalOrder(int n) {
        // Brute Force
        List<String> list = new ArrayList<>();
        for(int i = 1;i <= n;i++){
            list.add(String.valueOf(i));
        }
        Collections.sort(list);
        return list.stream().map(Integer::parseInt).collect(Collectors.toList());
    }
}