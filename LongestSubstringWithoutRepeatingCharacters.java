/*
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 * Difficulty: medium
 *
 */

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters{
  public static int lengthOfLongestSubstring(String s) {
    HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
    int Maxret = 0;
    int base = 0;
    for(int i = 0; i < s.length(); i++){
      if(hashmap.containsKey(s.charAt(i))){
        if(Maxret < hashmap.size()){
          Maxret = hashmap.size();
        }
        int tmp = hashmap.get(s.charAt(i));
        for(int j = base; j <= tmp; j++){
          hashmap.remove(s.charAt(j));
        }
        base = tmp + 1;
      }
      hashmap.put(s.charAt(i), i);
    }
    if(Maxret < hashmap.size()){
      Maxret = hashmap.size();
    }
    return Maxret;
  }
  public static void main(String[] Args){
    String s = new String("abcabcbb");
    System.out.println(lengthOfLongestSubstring(s));
  }
}
