/**
 * Determine if a sudoko is valid.
 *
 * Difficulty: medium
 */
class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] used_row = new int[9][9];
        int[][] used_column = new int[9][9];
        int[][] used_block = new int[9][9];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] != '.'){
                    if(used_row[i][board[i][j] - '0'-1] == 1 || used_column[j][board[i][j] - '0'-1] == 1 || used_block[i/3*3+j/3][board[i][j]-'0'-1] == 1){
                        return false;
                    }
                    used_row[i][board[i][j] - '0'-1] = 1;
                    used_column[j][board[i][j] - '0'-1] = 1;
                    used_block[i/3*3+j/3][board[i][j]-'0'-1] = 1;
                }
            }
        }
        return true;
    }
}
