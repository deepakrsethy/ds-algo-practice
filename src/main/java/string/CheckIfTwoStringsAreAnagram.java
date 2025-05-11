package string;

import java.util.Arrays;

public class CheckIfTwoStringsAreAnagram {
    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "acer";
        System.out.println(s1+" & "+s2+" are anagrams :"+checkIfAnagrams(s1,s2));
    }

    private static boolean checkIfAnagrams(String s1, String s2) {
        char[] chars1 = s1.toLowerCase().toCharArray();
        Arrays.sort(chars1);
        char[] chars2 = s2.toLowerCase().toCharArray();
        Arrays.sort(chars2);
        s1 = Arrays.toString(chars1);
        s2 = Arrays.toString(chars2);
        return s1.equals(s2);
    }
}
