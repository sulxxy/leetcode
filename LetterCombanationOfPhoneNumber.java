/*
 * Given a digit string, return all possible letter combinations that the number could represent.
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 *
 * Input:Digit string "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 *
 * Difficulty: medium
*/
class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.indexOf('0') != -1 || digits.indexOf('1') != -1 ||(digits != null && digits.isEmpty())){
            return new LinkedList<String>();
        }
        String[] strMapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> ret = new LinkedList<String>();
        ret.add("");
        for(int i = 0; i < digits.length(); i++){
            int digitTmp = digits.charAt(i) - '0';
            List<String> tmp = new LinkedList<String>();
            for(int j = 0; j < strMapping[digitTmp].length(); j++){
                for(int k = 0; k < ret.size(); k++){
                    tmp.add(ret.get(k) + strMapping[digitTmp].charAt(j));
                }
            }
            ret = tmp;
        }
        return ret;
    }
}
