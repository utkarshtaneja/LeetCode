class Solution {
    public static int nCr(int n,int r){
        int result = 1;
        for(int i = 0;i<r;i++){
            result = result * (n-i);
            result = result/(i+1);
        }
        return result;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        int result = 1;
        for(int i = 0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                row.add(nCr(i, j));
            }
            list.add(row);
        }
        return list;
    }
}