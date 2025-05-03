package array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyCount {
    public static void main(String[] args){
        int[] nums = {11, 12,34,11,32,13, 1,2, 12, 12, 56, 76, 89, 90, 45,13, 11, 7};
        findCountOfElements(nums);
        System.out.println("***************************");
        findCountOfElementsUsingStream(nums);
    }

    private static void findCountOfElementsUsingStream(int[] nums) {
        Map<Integer, Long> counts = Arrays.stream(nums)
                .boxed()
                .collect(
                        Collectors.groupingBy(
                                num ->
                                        num, Collectors.counting()));
        counts.forEach((key, value) -> System.out.println("Element:"+key+" Count:"+value));
    }

    private static void findCountOfElements(int[] nums) {
        if(nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input Array cannot be null or empty");
        }
        Map<Integer, Integer> counts = new HashMap<>();
        for(int num : nums) {
           counts.put(num, counts.getOrDefault(num, 0)+1);
        }
        counts.forEach((key,value) -> System.out.println("Element :"+key+" , Count: "+counts.get(key)));

    }
}
