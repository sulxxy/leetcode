/**
 * Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * If the target is not found in the array, return [-1, -1].
 * For example,
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4].
 *
 * Difficulty: medium
 *
 */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ret = {-1, -1};
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                ret[0] = i;
                int tmp = nums[i];
                while(i < nums.length && tmp == nums[i]){
                    i++;
                }
                ret[1] = i-1;
            }
        }
        return ret;
    }
}
