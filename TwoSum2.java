class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); //key: val, value: val
        int[] retIdx = new int[2];
        for(int i = 0; i < numbers.length; i++){
            if(map.containsKey(target - numbers[i])){
                retIdx[1] = i+1;
                retIdx[0] = map.get(target - numbers[i]);
                return retIdx;
            }
            else{
                map.put(numbers[i], i+1);
            }
        }
        return retIdx;
        
    }
}