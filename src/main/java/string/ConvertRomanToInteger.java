package string;

import java.util.HashMap;

public class ConvertRomanToInteger {

    private static HashMap<Character, Integer> romanMap = new HashMap<>();

    static {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

    public static void main(String[] args) {
        String roman = "IX";
        System.out.println(romanToDecimal(roman));
    }

    private static int romanToDecimal(String roman) {
        int result = 0;
        for(int i = 0; i < roman.length(); i++) {
            // If the current value is less than the next value,
            // subtract current from next and add to res
            if(i+1 < roman.length() && romanMap.get(roman.charAt(i)) < romanMap.get(roman.charAt(i+1))) {
                int stepResult = romanMap.get(roman.charAt(i+1)) - romanMap.get(roman.charAt(i));
                result += stepResult;

                // Skip the next symbol
                i++;
            } else {
                // Otherwise, add the current value to res
                result += romanMap.get(roman.charAt(i));
            }
        }
        return result;
    }
}
