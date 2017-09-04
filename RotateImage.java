class Solution {
    public void rotate(int[][] matrix) {
        int index_i_after_reverse = 0;
        int index_j_after_reverse = 0;
        for (int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix[i].length; j++){
                int tmp = 0;
                tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j  < matrix[i].length/2; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = tmp;
            }
        }
    }
}