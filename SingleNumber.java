/*
 * Given an array of integers, every element appears twice except for one. Find that single one.
 *
 * Difficulty: easy
 */
class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> hm = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(hm.contains(nums[i])){
                hm.remove(nums[i]);
            }else{
                hm.add(nums[i]);
            }
        }
        return hm.iterator().next();
    }
    /* excellent solution from leetcode discussion forum*/
    int singleNumber(int A[], int n) {
    int result = 0;
    for (int i = 0; i<n; i++)
    {
      result ^=A[i];
    }
    return result;
  }
}
