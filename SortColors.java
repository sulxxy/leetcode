class Solution {
    public void sortColors(int[] nums) {
        if(nums.length <= 1){
            return ;
        }
        int red_cnt = 0;
        int blue_cnt = 0;
        int white_cnt = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                red_cnt++;
            }
            if(nums[i] == 1){
                white_cnt++;
            }
            if(nums[i] == 2){
                blue_cnt++;
            }
        }
        for(int i = 0; i < red_cnt; i++){
            nums[i] = 0;
        }
        for(int i = red_cnt; i < red_cnt+white_cnt; i++){
            nums[i] = 1;
        }
        for(int i = red_cnt + white_cnt; i < nums.length; i++){
            nums[i] = 2;
        }
        return;
    }
}