class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        List<Integer> luckyNumbers = new ArrayList<>();
        
        for(int i = 0; i < row; i++) {
            int minInRow = Integer.MAX_VALUE;
            int minColIndex = -1;
            
            for(int j = 0; j < col; j++) {
                if (matrix[i][j] < minInRow) {
                    minInRow = matrix[i][j];
                    minColIndex = j;
                }
            }
            
            boolean isMaxInCol = true;
            for(int k = 0; k < row; k++) {
                if(matrix[k][minColIndex] > minInRow) {
                    isMaxInCol = false;
                    break;
                }
            }
            
            if(isMaxInCol) {
                luckyNumbers.add(minInRow);
            }
        }
        
        return luckyNumbers;
    }
}

// class Solution {
//     public List<Integer> luckyNumbers (int[][] matrix) {
//         int max = Integer.MIN_VALUE;
//         int row = matrix.length;
//         int col = matrix[0].length;
//         for(int i = 0;i<row;i++){
//             int min = Integer.MAX_VALUE;
//             for(int j = 0;j<col;j++){
//                 min = Math.min(min,matrix[i][j]);
//             }
//             max = Math.max(max,min);
//         }
//         List<Integer> list = new ArrayList<>();
//         list.add(max);
//         return list;
//     }
// }