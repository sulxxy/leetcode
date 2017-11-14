/**
 * Divide two integers without using multiplication, division and mod operator.
 * If it is overflow, return MAX_INT.
 *
 * Difficulty: medium
 *
 */
class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)){
            return Integer.MAX_VALUE;
        }
        int ret_sign = (divisor < 0) ^ (dividend < 0) ? -1:1;
        long dividend_long = Math.abs(dividend);
        if(dividend == Integer.MIN_VALUE){
            dividend_long = Math.abs(dividend+1);
            dividend_long += 1;
        }
        long divisor_long = Math.abs(divisor);
        if(divisor == Integer.MIN_VALUE){
            divisor_long = Math.abs(divisor+1);
            divisor_long += 1;
        }
        long ret = 0;
        while(dividend_long >= divisor_long){
            long divisor_tmp = divisor_long, multiple = 1;
            while(dividend_long >= (divisor_tmp << 1)){
                divisor_tmp <<= 1;
                multiple <<= 1;
            }
            dividend_long -= divisor_tmp;
            ret += multiple;
        }
        if(ret*ret_sign > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        return (int)(ret_sign*ret);
    }
}
