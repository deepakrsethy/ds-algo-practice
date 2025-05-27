import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        List<String> sentences = List.of("I am Deepak" , "I am Rajeev");
        char[] chars = {'i', 'a', 'd'};
        printCount(sentences, chars);
    }

    private static void printCount(List<String> sentences, char[] chars) {

        List<Character> characterList = new ArrayList<>();
        for(char c : chars) {
            characterList.add(c);
        }
        Map<Character, Integer> countMap = new HashMap<>();
        for(String s : sentences) {
            String[] words = s.toLowerCase().split(" ");
            for(String word: words) {
                if(characterList.contains(word.charAt(0))){
                    if(countMap.containsKey(word.charAt(0))) {
                        countMap.put(word.charAt(0), countMap.get(word.charAt(0))+1);
                    }else {
                        countMap.put(word.charAt(0),1);
                    }
                }
            }
        }
        for(Character c: countMap.keySet()) {
            System.out.println("Character: "+c+", Count: "+countMap.get(c));
        }
    }
}
