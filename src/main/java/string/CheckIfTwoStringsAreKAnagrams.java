package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckIfTwoStringsAreKAnagrams {
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "grammar";
        int k = 3;
        System.out.println(areKAnagrams(s1, s2, k));
    }

    private static boolean areKAnagrams(String s1, String s2, int k) {
        if(s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for(char c: s1.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(char c : s2.toCharArray()) {
            if(map.getOrDefault(c, 0) > 0) {
                map.put(c, map.get(c)-1);
            }
        }

        int count = 0;
        for(char c: map.keySet()) {
            count += map.get(c);
        }

        return count <= k ? true : false;
    }
}
