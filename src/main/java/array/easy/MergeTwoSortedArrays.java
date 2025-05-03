package array.easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MergeTwoSortedArrays {
    public static void main(String[] args){
        int[] arr1 = {1,4,6,7,11,23,45,99,130};
        int[] arr2 = {3,5,10,22,48,101};

        int[] result1 = mergeTwoSortedArraysOptimized(arr1, arr2);
        System.out.println(
                Arrays.stream(result1)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(",")));

        int[] result = mergeTwoSortedArrays(arr1, arr2);
        System.out.println(
                Arrays.stream(result)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(",")));
    }

    private static int[] mergeTwoSortedArraysOptimized(int[] arr1, int[] arr2) {
        int[] op = new int[arr1.length+arr2.length];
        int i = 0, j=0, k=0;
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] <= arr2[j]){
                op[k++] = arr1[i++];
            } else {
                op[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            op[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            op[k++] = arr2[j++];
        }
        return op;
    }

    private static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        int[] op = new int[arr1.length+arr2.length];
        int i = 0;
        for(; i < arr1.length; i++){
            op[i] = arr1[i];
        }
        for(int j= 0; j< arr2.length; j++, i++){
            op[i] = arr2[j];
        }
        Arrays.sort(op); // not optimized for sorted array
        return op;
    }
}
