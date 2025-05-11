package array.searching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MissingAndRepeating {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        findMissinfAndRepeating(arr);
    }

    private static void findMissinfAndRepeating(int[] arr) {
        int n = arr.length+1;
        int[] hash = new int[n];
        for(int i = 0; i <n-1; i++ ){
            hash[arr[i]]++;
        }
        Map<String, Integer> result = new HashMap<>();
        for(int i = 1; i <n; i++){
            if(hash[i] == 0) {
                result.put("Missing",i);
            }

            if(hash[i] > 1) {
                result.put("Repeating",i);
            }
        }
        result.forEach((key, value) -> System.out.println(key+":"+value));

    }
}
