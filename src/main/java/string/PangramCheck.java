package string;

public class PangramCheck {
    public static void main(String[] args) {
        /**
         * Given a string s, the task is to check if it is Pangram or not.
         * A pangram is a sentence containing all letters of the English Alphabet.
         */
        String s = "The quick brown fox jumps over the lazy dog" ;
        System.out.println("Pangram: "+checkIfPangram(s));
    }

    private static boolean checkIfPangram(String s) {
        int maxChars = 26;
        int[] frequency = new int[maxChars];
        char[] chars = s.replaceAll(" ","").toLowerCase().toCharArray();
        for(char c : chars) {
            frequency[c-'a']++;
        }

        for(int n : frequency) {
            if ( n < 1) {
                return false;
            }
        }
        return true;
    }
}
