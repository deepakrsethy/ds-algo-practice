package array.slidingwindow;

public class MaxNoVoweslnASubString {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));

    }

    public static int maxVowels(String s, int k) {
        s = s.toLowerCase();
        int noOfVowels = 0;
        for(int i =0; i < k ; i++) {
            char c = s.charAt(i);
            if( c == 'a'  || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                noOfVowels++;
            }
        }
        int maxNoVowels = noOfVowels;
        for(int i = k; i < s.length(); i++) {
            if(isAVowel(s.charAt(i))){
                noOfVowels = noOfVowels+1;
            }
            if(isAVowel(s.charAt(i-k))){
                noOfVowels = noOfVowels-1;
            }
            maxNoVowels = Math.max(noOfVowels, maxNoVowels);
        }
        return maxNoVowels;

    }
    private static boolean isAVowel(char c) {
        if( c == 'a'  || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        } else {
            return false;
        }
    }
}
