import java.util.*;

public class TwoSum{
	public static int[] twosum(int[] nums, int target){
		int[] ret = new int[2];
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer> ();
		for(int i = 0; i < nums.length; i++){
			hashmap.put(nums[i], i+1);
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
		System.out.println(twosum(s, 6)[0]);
		System.out.println(twosum(s, 6)[1]);
		return ;
	}
}

