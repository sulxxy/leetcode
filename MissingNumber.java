class Solution {
    public int missingNumber(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        long n = nums.length;
        long sum = n*(n+1)/2;
        for(int i = 0; i < nums.length; i++){
            sum -= nums[i];
        }
        return (int)sum;
    }
}