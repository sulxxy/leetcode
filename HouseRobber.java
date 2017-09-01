class Solution {
    public int rob(int[] nums) {
        if(nums == null){
            return 0;
        }
        
        int a = 0;
        int b = 0;
        for(int i = 0; i < nums.length; i++){
            if(i%2 == 0){
                a = Integer.max(a+nums[i], b);
            }
            else{
                b = Integer.max(b+nums[i], a);
            }
        }
        return Integer.max(a,b);
        
        
    }
}