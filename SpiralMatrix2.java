class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ret = new int[n][n];
        if(n == 0){
            return ret;
        }
        int starting_row = 0;
        int starting_col = 0;
        int ending_row = n - 1;
        int ending_col = n - 1;
        int cnt = 1;
        while(starting_row <= ending_row && starting_col <= ending_col){
            for(int i = starting_col; i <= ending_col; i++){
                ret[starting_row][i] = cnt++; 
            }
            starting_row++;
            for(int i = starting_row; i <=ending_row; i++){
                ret[i][ending_col] = cnt++;
            }
            ending_col--;
            
            // if(starting_col >= ending_col){
                for(int i = ending_col; i >= starting_col; i--){
                    ret[ending_row][i] = cnt++;
                }
                ending_row--;
            // }
            // if(starting_row >= ending_row){
                for(int i = ending_row; i >= starting_row; i--){
                    ret[i][starting_col] = cnt++;
                }
                starting_col++;
            // }
        }
        return ret;
    }
}