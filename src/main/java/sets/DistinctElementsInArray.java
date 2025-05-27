package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctElementsInArray {
    public static void main(String[] args) {
        int[] arr = {12, 10, 9, 45, 2, 10, 10, 45};
        int[] result = distinctElements(arr);
        System.out.println(Arrays.stream(result).mapToObj(String::valueOf).collect(Collectors.joining(",")));
    }

    private static int[] distinctElements(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Arrays.stream(arr).forEach(set::add);
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
