class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int s = 0;
        int e = row*col - 1;
        boolean flag = false;

        while(s <= e){
            int mid = s + (e-s)/2;
            
            int element = matrix[mid/col][mid%col];

            if(element == target){
                flag = true;
                break;
            }
            else if(element < target){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return flag;
    }
}