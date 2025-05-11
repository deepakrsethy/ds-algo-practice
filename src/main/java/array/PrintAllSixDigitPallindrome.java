package array;

public class PrintAllSixDigitPallindrome {
    public static void main(String[] args) {
        for(int i = 100000; i < 1000000; i++) {
            String s1 = Integer.toString(i);
            String s2 = new StringBuilder(s1).reverse().toString();

            if(s1.equals(s2)){
                System.out.println(i);
            }
        }
    }
}
