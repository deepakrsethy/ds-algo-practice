package array.twopointers;

import java.util.Arrays;

/**
 * Merges two Sorted arrays
 */
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,8,8,9,11,33,56};
        int[] arr2 = {4,4,5,10,22,46};
        int[] result = mergeTwoSortedArrays(arr1, arr2);
        System.out.println("Merged Array: "+ Arrays.toString(result));
    }

    /**
     * Merges two sorted arrays
     * @param arr1 first sorted array to be merged
     * @param arr2 second sorted array to be merged
     * @return returns an result array after merging arr1 and arr2
     */
    private static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new IllegalArgumentException("Input arrays cannot be null");
        }

        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j=0, k=0;
        while(i< arr1.length && j<arr2.length) {
            if(arr1[i] < arr2[j]){
                result[k] = arr1[i];
                i++;
            } else{
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length) {
            result[k]= arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        return result;
    }
}
