package string;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStringCheck {
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "xxy";
        System.out.println("Isomorphic : "+checkIsomorphic(s1, s2));
    }

    private static boolean checkIsomorphic(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for(int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if(map1.containsKey(c1) && map1.get(c1) != c2){
                return false;
            }
            map1.put(c1,c2);

            if(map2.containsKey(c2) && map2.get(c2) != c1) {
                return false;
            }
            map2.put(c2,c1);

        }
        return true;
    }
}
