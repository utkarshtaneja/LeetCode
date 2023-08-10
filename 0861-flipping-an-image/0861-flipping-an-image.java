class Solution {
    public static void reverse(int s,int e,int[] arr){
        while(s <= e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int col = image[0].length;
        int[] column = new int[col];

        for(int i = 0;i<row;i++){         
            reverse(0,col - 1,image[i]);
        }

        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(image[i][j] == 0){
                    image[i][j] = 1;
                }
                else{
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}