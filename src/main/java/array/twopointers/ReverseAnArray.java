package array.twopointers;

import java.util.Arrays;

/**
 * Reverses an Array
 */
public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,11,34,56,2,6,7,90};
        System.out.println("Before Reversing:"+Arrays.toString(arr));

        reverseArrayUsingTwoPointTechnique(arr);

        System.out.println("After Reversing:"+Arrays.toString(arr));
    }

    /**
     * Reverse an array in space using two pointer technique
     * @param arr the array to reverse
     */
    private static void reverseArrayUsingTwoPointTechnique(int[] arr) {
        if(arr == null || arr.length == 0) return;
        int left = 0;
        int right = arr.length-1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
