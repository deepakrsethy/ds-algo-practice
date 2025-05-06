package array.searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,34,55,67,89,0,34};
        int index = binarySearch(arr,134);
        if (index == -1) {
            System.out.printf("Target: %d is not found in the input array.%n", 134);
        } else {
            System.out.println("Found at index: " + index);
        }
    }

    private static int binarySearch(int[] arr, int target) {
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Input array can not be null");
        }
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while(left <= right) {
            int mid = left + (right-left)/2;
            if(arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return -1;
    }
}
