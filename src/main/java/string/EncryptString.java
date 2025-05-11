package string;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class EncryptString {
    public static void main(String[] args) {
        /**
         * Given a lowercase English string s of length n, encrypt it as follows:
         *
         * Replace each contiguous group of the same character with the character followed by the lowercase hexadecimal representation of its length.
         * Reverse the entire modified string.
         */
        String input = "aaaaaaaaaaa";
        String encryptedString = encryptString(input);
        System.out.println(encryptedString);
    }

    private static String encryptString(String input) {
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        for(char c: input.toCharArray()) {
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c)+1);
            } else {
                charCountMap.put(c,1);
            }
        }
        Set<Character> keys = new LinkedHashSet<>(charCountMap.keySet());
        for(char c: keys) {
            result.append(c);
            result.append(convertToHexadecimal(charCountMap.get(c)));
        }
        return result.reverse().toString();
    }

    private static String convertToHexadecimal(int num) {
        StringBuilder temp = new StringBuilder();
        while(num != 0) {
            int rem = num % 16;
            if(rem < 10) {
                temp.append((char)(rem + '0'));
            } else {
                temp.append((char)(rem -10 + 'a'));
            }
            num = num/16;
        }

        return temp.reverse().toString();
    }

}
