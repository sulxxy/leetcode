/**
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
 * If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
 * The replacement must be in-place, do not allocate extra memory.
 * Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 */
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length <= 1){
            return;
        }
        int i = nums.length - 2;
        for(; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                break;
            }
        }
        if(i >= 0){
            for(int j = nums.length-1; j>i; j--){
                if(nums[j] > nums[i]){
                    swap(nums, i, j);
                    reverse (nums, i+1, nums.length-1);
                    return;
                }
            }
        }
        reverse(nums, 0, nums.length-1);
        return ;
    }
    
    void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
        return;
    }
    
    void reverse(int[] nums, int i, int j){
        
        while(i < j){
            swap(nums, i, j);
            i++;
            j--;
        }
        return ;
    }
}
