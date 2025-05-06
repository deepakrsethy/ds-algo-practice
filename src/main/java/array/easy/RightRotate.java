package array.easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RightRotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("Before rotation: ["+
                Arrays.stream(arr)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(",")) +"]");
        //rightRotate(arr);

        rightRotate(arr, 2);

        System.out.println("After rotation: ["+
                Arrays.stream(arr)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(","))+"]");


    }

    private static void rightRotate(int[] arr) {
        if(arr == null || arr.length == 0){
           throw new IllegalArgumentException("Input array cannot be null or empty");
        }
        int temp = arr[arr.length-1];
        for(int i = arr.length-2; i >=0; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
    }

    private static void rightRotate(int[] arr, int k) {
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Input array cannot be null or empty");
        }
        k = k % arr.length;
        if(k == 0) {
            return;
        }

        reverseArray(arr, 0, arr.length-1);
        reverseArray(arr,0, k-1);
        reverseArray(arr,k, arr.length-1);

    }

    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
