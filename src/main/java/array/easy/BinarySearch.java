package array.easy;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args){
        int [] arr = {11, 23, -56, 33, 22, 11, 6, 23};
        int num = 6;
        int index = findElement(arr, num);
        System.out.println(index);
    }

    private static int findElement(int[] arr, int num) {
        if( arr == null || arr.length == 0 ){
            throw new IllegalArgumentException("Input array can not be null or empty");
        }
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            int mid = (left+right)/2;
            if (arr[mid] == num) {
                return mid;
            }
            else if(arr[mid] < num) {
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        return -1;
    }
}
