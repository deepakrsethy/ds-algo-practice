package string;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println("Longest Common prefix :"+findLongestCommonPrefix(input));
    }

    private static String findLongestCommonPrefix(String[] input) {
        Arrays.sort(input);
        String longestPrefix= "";
        String first = input[0];
        String last = input[input.length-1];
        int i=0, j = 0;
        if(first.length() < last.length()) {
            j = first.length();
        } else {
            j = last.length();
        }

        while (i < j) {
            if(first.charAt(i) == last.charAt(i)) {
                longestPrefix = longestPrefix+first.charAt(i);
            } else {
                break;
            }
            i++;
        }

        return longestPrefix;
    }
}
