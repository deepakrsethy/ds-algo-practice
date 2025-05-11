package string;

public class ClosetString {
    public static void main(String[] args) {
        String[] s = {"the", "quick", "brown", "fox", "quick"};
        String word1 = "the";
        String word2 = "quick";
        int d = findMaxDistanceBetweenTwoWords(s,word1, word2);
        System.out.println(d);

        int d1 = findMinDistanceBetweenTwoWords(s,word1, word2);
        System.out.println(d1);
    }

    private static int findMinDistanceBetweenTwoWords(String[] s, String word1, String word2) {
        int result = Integer.MAX_VALUE;
        int d1= -1;
        int d2 = -1;

        for(int i = 0; i < s.length; i++) {
            if(word1.equals(s[i])){
                d1 = i;
            }

            if(word2.equals(s[i])){
                d2 = i;
            }
            if (d1 != -1 && d2 != -1) {
                result = Math.min(result, Math.abs(d1-d2));
            }
        }

     return result;

    }

    private static int findMaxDistanceBetweenTwoWords(String[] s, String word1, String word2) {
        int d1= -1;
        int d2 = -1;

        for(int i = 0; i < s.length; i++) {
            if(word1.equals(s[i])){
                d1 = i;
            }

            if(word2.equals(s[i])){
                d2 = i;
            }
        }

       return Math.abs(d1-d2);
    }
}
