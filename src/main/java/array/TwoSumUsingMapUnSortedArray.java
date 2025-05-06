package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingMapUnSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,33,41,6,18,7,22,37};
        int target = 28;
        int[] result = findTwoSum(arr, target);
        System.out.println(result[0] +" "+result[1]);
    }

    private static int[] findTwoSum(int[] arr, int target) {
        Map<Integer, Integer> complementMap = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if(complementMap.containsKey(complement)){
                return new int[] {complementMap.get(complement), i};
            }
            complementMap.put(arr[i], i);
        }
        return new int[] {-1, -1};
    }
}
