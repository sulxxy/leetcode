/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * Difficulty: Easy
*/

import java.util.*;

public class TwoSum{
	public static int[] twosum(int[] nums, int target){
		int[] ret = new int[2];
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer> ();
		for(int i = 0; i < nums.length; i++){
      if(hashmap.containsKey(nums[i])){
        if(nums[i] * 2 == target){
          ret[0] = hashmap.get(nums[i]);
          ret[1] = i;
        }
      }
      else{
			  hashmap.put(nums[i], i);
      }
		}
		for(int j = 0; j < nums.length; j++){
			if(hashmap.containsKey(nums[j])){
				if(hashmap.containsKey(target-nums[j])){
					int a0 = hashmap.get(nums[j]);
					int a1 = hashmap.get(target - nums[j]);
					if(a0 == a1){
						continue;
					}
					else{
						ret[0] = a0;
						ret[1] = a1;
						return ret;
					}
				}
			}
		}
		return ret;
	}

	public static void main(String[] args){
		int[] s = {3, 2, 4};
    int[] res = twosum(s, 6);
		System.out.println(res[0]);
		System.out.println(res[1]);
		return ;
	}
}

