package logicbuilding;

public class CheckIfANumberIsPalindrome {
    public static void main(String[] args) {
        int num = 12321;
        boolean result = checkIfNumberIsPalindrome(num);
        System.out.println(result);
    }

    private static boolean checkIfNumberIsPalindrome(int num) {

        String s = String.valueOf(num);
        int left = 0;
        int right = s.length()-1;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
