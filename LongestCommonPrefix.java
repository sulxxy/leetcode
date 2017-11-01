/*
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * Difficulty: easy
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        StringBuffer sb = new StringBuffer();
        HashSet<Character> hs = new HashSet<Character>();
        int minStrLen = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int k = 0; k < strs.length; k++){
            if(strs[k].length() == 0){
                return "";
            }
            if(minStrLen > strs[k].length()){
                minStrLen = strs[k].length();
                minIndex = k;
            }
        }
        for(int j = 0; j < minStrLen; j++){
            hs.add(strs[minIndex].charAt(j));
            for(int i = 0;i < strs.length; i++){
                if(!hs.contains(strs[i].charAt(j))){
                    return sb.toString();
                }
            }
            hs.remove(strs[minIndex].charAt(j));
            sb.append(strs[minIndex].charAt(j));
        }
        return sb.toString();
    }
}
