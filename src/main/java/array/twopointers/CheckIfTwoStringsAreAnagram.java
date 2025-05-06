package array.twopointers;

import java.util.Arrays;

/**
 * Checks if two Strings are anagram
 */
public class CheckIfTwoStringsAreAnagram {
    public static void main(String[] args) {
        String s1 = new String("rasp");
        String s2 = new String("spar");

        System.out.println( "S1 :"+s1 + "and S2 :"+s2+" are anagram ? :"+ checkIfTwoStringsAreAnagram(s1, s2));
    }

    /**
     * Cheks if two strings are anagram or not
     * @param s1 input string1 for anagram check
     * @param s2 input string 2 for anagram check
     * @return returns true if twp strings are anagram and false if not
     */
    private static boolean checkIfTwoStringsAreAnagram(String s1, String s2) {
        if(s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty()) {
            throw new IllegalArgumentException("Input strings can not be null or empty");
        }
        if(s1.length() != s2.length()){
            return false;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        while(i< arr1.length) {
            if(arr1[i] != arr2[i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
