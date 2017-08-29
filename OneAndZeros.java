class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] memo = new int[m+1][n+1];
        for(int p = 0; p < strs.length; p++){
            int nZero = 0;
            int nOne = 0;
            for(int q = 0; q < strs[p].length(); q++){
                if(strs[p].charAt(q) == '0'){
                    nZero++;
                }
                if(strs[p].charAt(q) == '1'){
                    nOne++;
                }
            }
            
            for(int i = m; i >= nZero; i--){
                for(int j = n; j >= nOne; j--){
                    memo[i][j] = Integer.max(memo[i][j], memo[i-nZero][j-nOne] + 1);
                }
            }
        }
        return memo[m][n];
    }
}