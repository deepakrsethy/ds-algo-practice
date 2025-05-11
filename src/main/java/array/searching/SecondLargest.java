package array.searching;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {55,23,45,67,67, 89,89,2,3,4,5};
        int secondLargest = findSecondLargest(arr);
        System.out.println(secondLargest+" is the second largest in array "+ Arrays.toString(arr));
    }

    private static int findSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
