package array.twopointers;

import java.util.Arrays;

public class IsSubSequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc")); // true
        System.out.println(isSubsequence("axc", "ahbgdc")); // false
    }

    private static boolean isSubsequence(String s1, String s2) {
      int i =0, j=0;
      while (i < s1.length() && j < s2.length()) {
          if(s1.charAt(i) == s2.charAt(j)) {
              i++;
          }
          j++;
      }
      return i == s1.length();
    }
}
