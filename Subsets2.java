class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }
    void backtrack(List<List<Integer>> list, List<Integer> tmplist, int[] nums, int starts){
        list.add(new ArrayList<>(tmplist));
        for(int i = starts; i < nums.length; i++){
            if(i > starts && nums[i] == nums[i-1]){
                continue;
            }
            tmplist.add(nums[i]);
            backtrack(list, tmplist, nums, i+1);
            tmplist.remove(tmplist.size() - 1);
        }
    }
}