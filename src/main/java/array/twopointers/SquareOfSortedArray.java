package array.twopointers;

import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {-6, -3, -1, 2, 4, 5};
        int[] result = squareOfSortedArray(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] squareOfSortedArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;

        int index = arr.length-1;
        int[] result = new int[arr.length];

        while(left <= right) {
            int squareLeft = arr[left] * arr[left];
            int squareRight = arr[right] * arr[right];
            if(squareLeft > squareRight) {
                result[index--] = squareLeft;
                left++;
            } else {
                result[index--] = squareRight;
                right--;
            }
        }
        return result;
    }
}
