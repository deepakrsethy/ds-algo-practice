package string;

import java.util.Arrays;

public class CountDistinctSubSequences {
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
        int result = countUniqueSubSequence(s);
    }

    private static int countUniqueSubSequence(String str) {
        int n = str.length();

        // to store the last occurrence
        // of each character in the string
        int[] last = new int[26];
        Arrays.fill(last, 0);
        int res = 1;

        for (int i = 1; i <= n; i++) {

            // double the count of unique subsequences
            // and remove the repetition
            int cur = 2 * res - last[str.charAt(i - 1) - 'a'];

            // update the last occurrence of the character
            last[str.charAt(i - 1) - 'a'] = res;
            res = cur;
        }
        return res;
    }

}
