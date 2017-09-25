class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        if(m == 0){
            return 0;
        }
        int n = grid[0].length;
        int count = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1'){
                    traverseIsland(grid, m, n, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    
    private void traverseIsland(char[][] grid, int maxRow, int maxCol, int curRow, int curCol){
        if(curRow < 0 || curCol < 0 ||curRow >= maxRow || curCol >= maxCol || grid[curRow][curCol] == '0'){
            return;
        }
        grid[curRow][curCol] = '0';
        traverseIsland(grid, maxRow, maxCol, curRow, curCol-1);
        traverseIsland(grid, maxRow, maxCol, curRow, curCol+1);
        traverseIsland(grid, maxRow, maxCol,curRow-1, curCol);
        traverseIsland(grid, maxRow, maxCol,curRow+1, curCol);
    }
}