class Solution {
    public String convertToBase7(int num) {
        int coefficient = 1;
        if(num == 0){
            return "0";
        }
        else if(num < 0){
            num = -num;
            coefficient = -1;
        }
        StringBuffer sb = new StringBuffer();
        while(num != 0){
            sb.append(Integer.toString(num%7));
            num = num / 7;
        }
        if(coefficient == -1){
            sb.append("-");
        }
        String s = sb.reverse().toString();
        return s;
    }
}