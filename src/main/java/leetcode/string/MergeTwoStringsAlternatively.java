package leetcode.string;

public class MergeTwoStringsAlternatively {

    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
        String actualOutput1 = mergeTwoStrings(word1, word2);
        String expectedOutput1 = "apbqcr";
        System.out.println("Word1: "+word1+", Word2: "+word2+", Merged Strings: "+actualOutput1);
        System.out.println("Tested OK: "+actualOutput1.equals(expectedOutput1));

        String word3 = "ab", word4 = "pqrs";
        String actualOutput2 = mergeTwoStrings(word3, word4);
        String expectedOutput2 = "apbqrs";
        System.out.println("Word1: "+word3+", Word2: "+word4+", Merged Strings: "+actualOutput2);
        System.out.println("Tested OK: "+actualOutput2.equals(expectedOutput2));

        String word5 = "abcd", word6 = "pq";
        String actualOutput3 = mergeTwoStrings(word5, word6);
        String expectedOutput3 = "apbqcd";
        System.out.println("Word1: "+word5+", Word2: "+word6+", Merged Strings: "+actualOutput3);
        System.out.println("Tested OK: "+actualOutput3.equals(expectedOutput3));

        String actualOutput4 =  mergeTwoStrings_noNeedToIterateForExtraChars(word5, word6);
        System.out.println("Word1: "+word5+", Word2: "+word6+", Merged Strings: "+actualOutput4);
        System.out.println("Tested OK: "+actualOutput4.equals(expectedOutput3));
    }

    private static String mergeTwoStrings(String word1, String word2) {
        String output = "";
        for(int i = 0, j = 0; i < word1.length() || j < word2.length(); i++, j++) {
            if(i < word1.length()){
                output = output + word1.charAt(i);
            }

            if(i < word2.length()) {
                output = output + word2.charAt(j);
            }
        }
        return output;
    }

    private static String mergeTwoStrings_noNeedToIterateForExtraChars(String word1, String word2) {
       StringBuilder output = new StringBuilder();
       int length1 = word1.length();
       int length2 = word2.length();
       int i = 0, j = 0;
       while(i < length1 && j < length2) {
           output.append(word1.charAt(i));
           output.append(word2.charAt(j));
           i++;
           j++;
       }

       if(i < length1) {
           output.append(word1.substring(i));
       }

       if(j < length2) {
            output.append(word2.substring(j));
       }

       return output.toString();
    }
}
