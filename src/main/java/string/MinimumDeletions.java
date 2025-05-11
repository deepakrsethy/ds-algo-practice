package string;

import java.util.Arrays;

public class MinimumDeletions {
    public static void main(String[] args) {
        /**
         * Given a string s of length n, the task is to remove or delete the minimum number of characters from the string so that the resultant string is a palindrome.
         *
         * Note: The order of characters should be maintained.
         *
         * Examples :
         *
         * Input : s = “aebcbda”
         * Output : 2
         * Explanation: Remove characters ‘e’ and ‘d’. Resultant string will be “abcba” which is a palindromic string
         */
        String s = "aebcbda";
        int deletions = findDeletionsToMakePalindrome(s);
        System.out.println(deletions);
    }

    private static int findDeletionsToMakePalindrome(String s) {
        if(s == null || s.length() == 0) {
            return -1;
        }
        int count = 0;

        int left = 0;
        int right = s.length()-1;
        while(left < right) {
            if(s.charAt(left)  != s.charAt(right)) {
                count += 2;
            }
            left++;
            right--;
        }

        return count;
    }
}
