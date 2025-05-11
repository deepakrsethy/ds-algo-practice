package string;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "racecar";
        System.out.println(findNonRepeating(input));
    }

    private static char findNonRepeating(String input) {
        int MAX_CHAR = 26;
        int[] frequency = new int[MAX_CHAR];
        for(char c: input.toCharArray()) {
            frequency[c-'a']++;
        }

        for(char c: input.toCharArray()) {
            if(frequency[c-'a'] ==1) {
                return c;
            }
        }
        return '$';
    }

}
