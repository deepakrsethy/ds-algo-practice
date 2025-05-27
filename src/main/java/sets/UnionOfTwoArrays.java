package sets;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        /**
         * Given two sorted arrays a[] and b[],
         * the task is to return union of both the arrays in sorted order.
         * Union of two arrays is an array having all distinct elements that are present in either array.
         * The input arrays may contain duplicates.
         */
        int[] arr1 = {1,1,2,2,2,4};
        int[] arr2 = {2,2,4,4};
        int[] result = performUnion(arr1, arr2);
        System.out.println(
                Arrays.stream(result)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(",")));
    }

    private static int[] performUnion(int[] arr1, int[] arr2) {
        Set<Integer> set = new TreeSet<>();
        Arrays.stream(arr1).forEach(set::add);
        Arrays.stream(arr2).forEach(set::add);
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
