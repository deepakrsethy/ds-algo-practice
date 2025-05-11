package string;

import java.util.Arrays;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";
        System.out.println("Reverse Words:"+reverseWords(str));
    }

    private static String reverseWords(String str) {

        if(str == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }
        String[] words = str.split("\\.");
        int left = 0, right = words.length-1;
        while(left < right){
            String temp = words[right];
            words[right] = words[left];
            words[left] = temp;
            left++;
            right--;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < words.length; i++) {
            if(i>0){
                sb.append(".");
            }
            sb.append(words[i]);
        }
        return sb.toString();
    }

}
