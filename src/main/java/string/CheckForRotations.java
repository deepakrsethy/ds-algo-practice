package string;

public class CheckForRotations {
    public static void main(String[] args) {
        /**
         * Input: s1 = “abcd”, s2 = “cdab”
         * Output: true
         * Explanation: After 2 right rotations, s1 will become equal to s2.
         *
         *
         * Input: s1 = “aab”, s2 = “aba”
         * Output: true
         * Explanation: After 1 left rotation, s1 will become equal to s2.
         *
         *
         * Input: s1 = “abcd”, s2 = “acbd”
         * Output: false
         * Explanation: Strings are not rotations of each other.
         */

        String s1 = "abcd", s2= "cdab";
        /**
         * right rotate s1 by 1 -> dabc
         * right again s1 by 1 -> cdab == s2
         *
         * so abcd+abcd = abcdabcd contains all right rotations of S2
         *
         * left rotate s1 by 1 -> bcda
         * left rotate s1 by 1 -> cdab
         *
         * so abcd+abcd = abcdabcd contains all left rotations of S2
         */
        System.out.println(checkForRotation(s1, s2));

    }

    private static boolean checkForRotation(String s1, String s2) {
        s1 = s1+s1;
        return s1.contains(s2);
    }
}
