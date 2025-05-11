package string;

public class PalindromeCheck {
    public static void main(String[] args) {
        String s1 ="abba";
        System.out.println(checkIfPalindrome(s1));
        String s2 = "abc";
        System.out.println(checkIfPalindrome(s2));
    }

    private static boolean checkIfPalindrome(String s) {
        if(s == null || s.isEmpty()){
            throw new IllegalArgumentException("Input string can not be null or empty");
        }

        if(s.length() == 1) {
            return true;
        }

        char[] chars = s.toLowerCase().toCharArray();
        int left = 0;
        int right =chars.length-1;
        while(left < right) {
            if(chars[left] != chars[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
