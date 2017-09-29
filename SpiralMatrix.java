class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ret = new ArrayList<Integer>();
        if(matrix == null || matrix.length <= 0){
            return ret;
        }
        int ending_row = matrix.length-1;
        int ending_column = matrix[0].length-1;
        int starting_row = 0;
        int starting_column = 0;
        while(starting_row <= ending_row && starting_column <= ending_column){
            for(int i = starting_column; i <= ending_column; i++){
                ret.add(matrix[starting_row][i]);
            }
            starting_row++;
            for(int j = starting_row; j <= ending_row; j++){
                ret.add(matrix[j][ending_column]);
            }
            ending_column--;
            if(starting_row <= ending_row){
                for(int k = ending_column; k>=starting_column; k--){
                    ret.add(matrix[ending_row][k]);
                }
                ending_row--;
            }
            if(starting_column <= ending_column){
                for(int q = ending_row; q >= starting_row; q--){
                    ret.add(matrix[q][starting_column]);
                }
                starting_column++;
            }
        }
        return ret;
    }
}