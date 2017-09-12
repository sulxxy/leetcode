class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtracking(list, new ArrayList<Integer>(), nums);
        return list;
    }
    
    private void backtracking(List<List<Integer>> list, ArrayList<Integer> tmpList, int nums[]){
        if(tmpList.size() == nums.length){
            list.add(new ArrayList<>(tmpList));
        }
        else{
            for(int i = 0; i < nums.length; i++){
                if(tmpList.contains(nums[i])){
                    continue;
                }
                tmpList.add(nums[i]);
                backtracking(list, tmpList, nums);
                tmpList.remove(tmpList.size()-1);
            }
        }
    }
    
}