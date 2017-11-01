/*
 * Reverse digits of an integer.
 *
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 *
 * Note:
 * The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
 *
 * Difficulty: easy
 */

import java.util.*;

public class ReverseInteger{
  public static int reverse(int x){
    long ret = 0;
    while(x != 0){
      ret = ret * 10 + x % 10;
      x = x/10;
    }
    if(ret > Integer.MAX_VALUE || ret < Integer.MIN_VALUE){
      return 0;
    }
    else{
      return (int)ret;
    }
  }

  public static void main(String[] args){
    System.out.println(reverse(12345));
  }
}
