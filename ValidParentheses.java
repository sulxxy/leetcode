/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 *
 * Difficulty: easy
 */
class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 == 1){
            return false;
        }
        String LeftPar = "{[(";
        String RightPar = "}])";
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < s.length(); i++){
            if(LeftPar.indexOf(s.charAt(i)) != -1){
                sb.append(s.charAt(i));
            }
            else if(sb.length() > 0){
                if(RightPar.indexOf(s.charAt(i)) == LeftPar.indexOf(sb.charAt(sb.length() - 1))){
                    sb.setLength(sb.length() -1);
                }
            }
        }
        return sb.length() == 0;
    }
}
