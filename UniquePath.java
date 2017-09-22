class Solution {
    public int uniquePaths(int m, int n) {
        if(m <= 1 || n <=1){
            return 1;
        }
        int[][] ret = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(j == 0 || i == 0){
                    ret[i][j] = 1;
                }
                else{
                    ret[i][j] = ret[i][j-1] + ret[i-1][j];
                }
            }
        }
        return ret[m-1][n-1];
    }
}