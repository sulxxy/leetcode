/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 *
 * Difficulty: easy
 */
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0){
            return Integer.MIN_VALUE;
        }
        int low = 0;
        int high = low;
        int sumMax = nums[0];
        int tmpSum = nums[0];
        for(high = 0; high < nums.length - 1;){
            high++;
            if(nums[low] < 0 || tmpSum + nums[high] <= 0 ){
                low = high;
                tmpSum = nums[low];
            }
            else{
                tmpSum += nums[high];
            }
            if(sumMax < tmpSum){
                sumMax = tmpSum;
            }
        }
        return sumMax;
    }
}
