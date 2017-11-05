/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 * Example 1:
 * Input: [1,3,5,6], 5
 * Output: 2
 * Example 2:
 *
 * Input: [1,3,5,6], 2
 * Output: 1
 * Example 3:
 *
 * Input: [1,3,5,6], 7
 * Output: 4
 * Example 1:
 *
 * Input: [1,3,5,6], 0
 * Output: 0
 *
 * Difficulty: easy
 *
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0){
            return 0;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }
    public int searchInsert(int[] nums, int target) {
      if(nums.length == 0){
        return 0;
      }
      if(nums[nums.length-1] < target){
        return nums.length;
      }
      if(nums[0] > target){
        return 0;
      }
      int low = 0;
      int high = nums.length - 1;
      while(low < high-1){
          int mid = (high + low)/2;
          if(nums[mid] > target){
              high = mid;
          }
          else{
              low = mid;
          }
      }
      if(nums[low] == target){
          return low;
      }
      else{
          return high;
      }
    }
}
