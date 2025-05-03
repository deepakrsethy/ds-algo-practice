package array.easy;

import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElement {
    public static void main(String[] args){
        int[] nums = {11, 12,34,11,32,13, 1,2, 12, 12, 56, 76, 89, 90, 45,13, 11, 7};
        int[] result = removeDuplicateElements(nums);
        System.out.println(
                Arrays.stream(result)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(",")));
        result = removeDuplicateElementsUsingStream(nums);
        System.out.println(
                Arrays.stream(result)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(",")));
    }

    private static int[] removeDuplicateElementsUsingStream(int[] nums) {
        return Arrays.stream(nums).distinct().toArray();
    }

    private static int[] removeDuplicateElements(int[] nums) {
        Set<Integer> tempStore = new LinkedHashSet<>();
        for (int num: nums) {
            tempStore.add(num);
        }
        int[] op = new int[tempStore.size()];
        int x = 0;
        for(int n : tempStore) {
            op[x] = n;
            x++;
        }
        return op;
    }
}
