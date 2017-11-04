/*
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 *
 * Difficulty: medium
 */
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int retTarget = target;
        int deltaMin = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length - 2; i++){
            if( i == 0 || (i > 0 && nums[i] != nums[i-1])){
                int low = i + 1;
                int high = nums.length - 1;
                while(low < high){
                    int deltaTmp = target - nums[low] - nums[high] - nums[i];
                    if(Math.abs(deltaTmp) < deltaMin){
                        if(deltaTmp == 0){
                            return target;
                        }
                        deltaMin = Math.abs(deltaTmp);
                        retTarget = target - deltaTmp;
                    }
                    if(deltaTmp > 0){
                        while(low < high && nums[low] == nums[low+1]){
                        low++;
                        }
                        low++;
                    }
                    else if(deltaTmp < 0){
                        while(low < high && nums[high] == nums[high-1]){
                        high--;
                        }
                        high--;
                    }
                }
                // System.out.print("i: ");
                // System.out.println(i);
                // System.out.print("low: ");
                // System.out.println(low);
                // System.out.print("high: ");
                // System.out.println(high);
                // System.out.print("ret: ");
                // System.out.println(retTarget);
                // System.out.println("=== ");
            }
        }
        return retTarget;
    }
}
