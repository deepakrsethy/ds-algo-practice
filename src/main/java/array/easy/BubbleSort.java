package array.easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12,3,6,33,11,2,1};
        System.out.println("Before sorting: ["+
                Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(","))
        +"]");
        bubbleSort(arr);

        System.out.println("After sorting: ["+
                Arrays.stream(arr)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(","))
                +"]");
    }

    private static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j< arr.length-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
