class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < row; i++) {
            int minInRow = Integer.MAX_VALUE;
            int index = -1;
            for(int j = 0; j < col; j++) {
                if(matrix[i][j] < minInRow) {
                    minInRow = matrix[i][j];
                    index = j;
                }
            }
            boolean isMaximum = true;
            for(int k = 0; k < row; k++) {
                if(matrix[k][index] > minInRow) {
                    isMaximum = false;
                    break;
                }
            }
            
            if(isMaximum) {
                ans.add(minInRow);
            }
        }
        
        return ans;
    }
}

