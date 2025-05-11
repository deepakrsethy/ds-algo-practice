package string;

public class ReverseAString {
    public static void main(String[] args) {
        String s1 = "abcdefg";
        System.out.println("Reversed String: "+reverseAString(s1));
    }

    private static String reverseAString(String s1) {

        if(s1 == null || s1.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }

        StringBuilder sb = new StringBuilder();
        int n = s1.length()-1;
        for(; n >= 0; n--) {
            sb.append(s1.charAt(n));
        }
        return sb.toString();
    }
}
