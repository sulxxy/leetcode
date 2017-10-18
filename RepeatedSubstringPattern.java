class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for(int i = 1; i <= len/2; i++){
            if(len%i == 0){
                int n = len/i;
                String unitSubStr = s.substring(0, i);
                StringBuffer sb = new StringBuffer();
                for(int j = 0; j < n; j++){
                    sb.append(unitSubStr);
                }
                if(sb.toString().equals(s)){
                    return true;
                }
            }
        }
        return false;
    }
}