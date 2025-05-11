package array.twopointers.easy;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,0,0,11,2,4,0};
        moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveZerosToEnd(int[] arr) {
        int count= 0;
        for(int i= 0;i< arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }

        }
    }

}
