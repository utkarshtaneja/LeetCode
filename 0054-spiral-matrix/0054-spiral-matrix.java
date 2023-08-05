class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;

        int count = 0;
        int total = row * col;

        // index initialization
        int startingRow = 0;
        int startingCol = 0;
        int endingRow = row - 1;
        int endingCol = col- 1;

        while(count < total){

            // print starting row
            for(int i = startingRow;count < total && i <= endingCol ;i++){
                list.add(matrix[startingRow][i]);
                count++;
            }

            startingRow++;

            // print ending column
            for(int i = startingRow;count < total && i <= endingRow ;i++){
                list.add(matrix[i][endingCol]);
                count++;
            }

            endingCol--;

            // print ending row
            for(int i = endingCol;count < total && i >= startingCol;i--){
                list.add(matrix[endingRow][i]);
                count++;
            }

            endingRow--;
            
            // print starting column
            for(int i = endingRow;count < total && i >= startingRow;i--){
                list.add(matrix[i][startingCol]);
                count++;
            }

            startingCol++;
        }

        return list;
    }
}