package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,1,3,1};
        int[] arr2 = {3,1,3,4,1};
        int[] result = findInterSection(arr1, arr2);
        System.out.println(
                Arrays.stream(result)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(","))
        );

    }

    private static int[] findInterSection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Arrays.stream(arr1).forEach(set1::add);

        Set<Integer> common = new HashSet<>();
        for(int n: arr2) {
            if(set1.contains(n)){
                common.add(n);
            }
        }
        return common.stream().mapToInt(Integer::intValue).toArray();
    }
}
