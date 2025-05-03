package array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseAnArray {
    public static void main(String[] args){
        int [] arr = {1, 34,54,23,7,8,6,11,1,3,43,34};
        reverseAnArray(arr);
        System.out.println(Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(",")));
    }

    private static void reverseAnArray(int[] arr) {
        if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input array can not be null or empty");
        }
        int left = 0;
        int right = arr.length -1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
