/*
 * Determine whether an integer is a palindrome. Do this without extra space.
 *
 * Difficulty: easy
 */

public class PalindromeNumber{
  public static boolean isPalindrome(int x){
    if(x < 0){
      return false;
    }
    long ret = 0;
    int tmp = x;
    while(tmp != 0){
      ret = ret * 10 + tmp % 10;
      tmp = tmp/10;
    }
    if(ret > Integer.MAX_VALUE || ret < Integer.MIN_VALUE){
      return false;
    }
    else{
      return x == ret;
    }
  }

  public static void main(String[] args){
    System.out.println(isPalindrome(12321));
    return ;
  }
}
