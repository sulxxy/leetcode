/* 
 * Given an integer, convert it to a roman numeral.
 * Input is guaranteed to be within the range from 1 to 3999.
 * Difficulty: mediam
 */ 
class Solution { public String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    public int[] digits = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    public String intToRoman(int num) {
        for(int i = 0; i < digits.length; i++){
            if(digits[i] <= num){
                return romans[i]+intToRoman(num-digits[i]);
            }
        }
        return "";
    }
}
