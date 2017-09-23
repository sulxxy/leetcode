class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        if(m <= 0){
            return 0;
        }
        int n = obstacleGrid[0].length;
        
        int[][] ret = new int[m][n];
        for(int i = 0; i < m; i++){
            if(obstacleGrid[i][0] == 1){
                for(int j = i; j < m; j++){
                    ret[j][0] = 0;
                }
                break;
            }
            else{
                ret[i][0] = 1;
            }
        }
        for(int i = 0; i < n; i++){
            if(obstacleGrid[0][i] == 1){
                for(int j = i; j < n; j++){
                    ret[0][j] = 0;
                }
                break;
            }
            else{
                ret[0][i] = 1;
            }
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(obstacleGrid[i][j] == 1){
                        ret[i][j] = 0;
                    }
                    // if(obstacleGrid[i][j-1] == 1 && obstacleGrid[i-1][j] == 1){
                    //     ret[i][j] = 0;
                    // }
                    // else if(obstacleGrid[i][j-1] == 1){
                    //     ret[i][j] = ret[i-1][j];
                    // }
                    // else if(obstacleGrid[i-1][j] == 1){
                    //     ret[i][j] = ret[i][j-1];
                    // }
                    else{
                        ret[i][j] = ret[i-1][j] + ret[i][j-1];
                    }
            }
        }
        return ret[m-1][n-1];
    }
}