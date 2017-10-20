class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        ArrayList<Character>[] bucket = new ArrayList[s.length()+1];
        for(Character c : map.keySet()){
            if(bucket[map.get(c)] == null){
                bucket[map.get(c)] = new ArrayList<>();
            }
            bucket[map.get(c)].add(c);
        }
        
        StringBuffer sb = new StringBuffer();
        for(int i = bucket.length - 1; i >=0; i--){
            if(bucket[i] != null){
                for(char c : bucket[i]){
                    for(int j = 0; j < i; j++){
                        // System.out.println(bucket[i]);
                        sb.append(c);
                }
                }
            }
        }
        return sb.toString();
    }
}