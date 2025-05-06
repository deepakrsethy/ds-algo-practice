package array.easy;

import java.util.Arrays;
import java.util.stream.Collectors;

//left rotate or anti-clockwise rotation
public class LeftRotateAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("Before rotation: ["+
                Arrays.stream(arr)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(",")) +"]");
        //leftRotate(arr);
        leftRotate(arr, 2);
        System.out.println("After rotation: ["+
                Arrays.stream(arr)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(","))+"]");
    }

    private static void leftRotate(int[] arr) {
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length -1] = temp;
    }

    private static void leftRotate(int[] arr, int k) {
       if (arr == null && arr.length == 0){
           throw new IllegalArgumentException("Input array cannot be null or empty");
       }
       k = k % arr.length; // to handle if k > arr.length;
       if(k == 0){
           return;
       }
       reverse(arr, 0, k-1);
       reverse(arr, k, arr.length-1);
       reverse(arr, 0, arr.length-1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
