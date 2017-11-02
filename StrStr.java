/*
 * Implement strStr().
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Difficulty: easy
 */
class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.equals(needle)){
            return 0;
        }
        if(needle.length() == 0){
            return 0;
        }
        if(needle.length() > haystack.length()){
            return -1;
        }
        int i = 0;
        for(i = 0; i < haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                int k = i;
                int j = 0;
                if(needle.length() > haystack.length() - i){
                    return -1;
                }
                while(j < needle.length() && k < haystack.length() && haystack.charAt(k) == needle.charAt(j) ){
                    j++;
                    k++;
                }
                if(j == needle.length()){
                    return i;
                }
            }
        }
        return -1;
    }
}
