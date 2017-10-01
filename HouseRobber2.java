class Solution {
    public int rob(int[] nums) {
        if(nums == null){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        return Integer.max(helper(nums, 0, nums.length-2), helper(nums, 1, nums.length-1));
    }
    
    public int helper(int[] nums, int low, int hi){
        int a = 0;
        int b = 0;
        for(int i = low; i <= hi; i++){
            if(i%2 == 0)
                a = Integer.max(a+nums[i], b);
            else
                b = Integer.max(b+nums[i], a);
        }
        return Integer.max(a, b);
    }
}