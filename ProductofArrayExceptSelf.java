class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        if(n <= 1){
            return nums;
        }
        int[] ret = new int[n];
        ret[0] = 1;
        for(int i = 1; i < n; i++){
            ret[i] = ret[i-1] * nums[i-1];
        }
        
        int right = 1;
        for(int i = n - 1; i >= 0; i--){
            ret[i] *= right;
            right *= nums[i];
        }
        
        return ret;
    }
}