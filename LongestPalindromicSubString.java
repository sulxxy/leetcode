class LongestPalindromicSubString {
    /* wrong version
     * Could not transfer this to LCS problem
     * e.g. abcdefdcba
     *
     * */
    public String longestPalindrome_zli(String s) {
        String sReverse = new StringBuffer(s).reverse().toString();
        int longestlength = 0;
        int[] ret = new int[2];
        /* now, it becomes Longest Common String problem, using DP */
        int LCS[][] = new int[s.length() + 1][sReverse.length() + 1];
        for(int i = 0; i <= s.length(); i++){
            for(int j = 0; j <= sReverse.length(); j++){
                if(i == 0 || j == 0){
                    LCS[i][j] = 0;
                }
                else if(s.charAt(i-1) == sReverse.charAt(j-1)){
                    LCS[i][j] = LCS[i - 1][j - 1] + 1;
                    // System.out.println("i:" + i + " - " + s.charAt(i-1));
                    // System.out.println("j:" + j + " - " + s.charAt(j-1));
                    longestlength = Integer.max(longestlength, LCS[i][j]);
                    if(ret[0] != longestlength){
                        ret[0] = longestlength;
                        ret[1] = i;
                    }
                }
                else{
                    LCS[i][j] = 0;
                }
            }
        }
        // System.out.println(ret[1]);
        // System.out.println(ret[0]);
        return s.substring(ret[1]-ret[0], ret[1]);
    }

    /*
     * Correct one, copied from:
     * https://discuss.leetcode.com/topic/23498/very-simple-clean-java-solution
     *
     */
    private int maxLen, lo;
    public String longestPalindrome(String s) {
      int len = s.length();
      if (len < 2)
        return s;
      for (int i = 0; i < len-1; i++) {
        extendPalindrome(s, i, i);
        extendPalindrome(s, i, i+1);
      }
      return s.substring(lo, lo + maxLen);
    }
    private void extendPalindrome(String s, int j, int k) {
      while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
        j--;
        k++;
      }
      if (maxLen < k - j - 1) {
        lo = j + 1;
        maxLen = k - j - 1;
      }
    }
}
