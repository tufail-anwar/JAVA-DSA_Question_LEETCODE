class Solution {
    public void rotate(int[][] matrix) {
        int x=0;
        int[][] temp=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                temp[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            int k=matrix.length-1;
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=temp[k][x];
                k--;
            }
            x++;
        }
        
    }
}