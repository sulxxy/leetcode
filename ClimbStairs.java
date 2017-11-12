/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Note: Given n will be a positive integer.
 *
 * Difficulty: easy
 *
 */


class Solution {
    public int climbStairs(int n) {
        if(n <= 0){
            return 0;
        }
        if(n <= 2){
            return n;
        }

        int n1 = 2;
        int n2 = 1;
        int tot = n1 + n2;
        for(int i = 2; i < n; i++){
            tot = n1 + n2;
            n2 = n1;
            n1 = tot;
        }
        return tot;
    }
}
