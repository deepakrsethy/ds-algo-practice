package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] arr = {"rat", "man","tar", "anm","art", "bat"};
        List<List<String>> result = groupAnagrams(arr);
        result.stream().forEach(strings -> System.out.println(strings));
    }

    private static List<List<String>> groupAnagrams(String[] arr) {
        Map<String, List<String>> groupedAnagrams = new HashMap<>();
        for(String word : arr) {
            char[] chars = word.toLowerCase().toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if(!groupedAnagrams.containsKey(key)){
                groupedAnagrams.put(key, new ArrayList<>());
            }
            groupedAnagrams.get(key).add(word);
        }
        return new ArrayList<>(groupedAnagrams.values());
    }
}
