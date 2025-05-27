package array.twopointers.easy;

import java.util.Arrays;

/**
 * Checks if an integer array is a palindrome.
 */
public class CheckIfArrayIsPalindrome {
    public static void main(String[] args) {
        int[][] testCases = {
                {1, 2, 3, 4, 3, 2, 1},
                {1, 2, 3, 4, 4, 3, 2, 1},
                {1, 2, 3, 4, 5, 3, 2, 1},
                {1},
                {},
                {1, 1, 1, 1},
                {1, 1, 1}
        };

        for (int[] arr : testCases) {
            System.out.println(Arrays.toString(arr) + " => " + checkIfPalindrome(arr));
        }
    }
    /**
     * Checks if an array is a palindrome or not.
     * @param arr the array to check
     * @return true if the array is a palindrome, false otherwise
     */
    private static boolean checkIfPalindrome(int[] arr) {
        if(arr == null) {
            throw new IllegalArgumentException("Input array can not be null");
        }
        int left = 0;
        int right = arr.length -1;
        while(left < right) {
            if(arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
