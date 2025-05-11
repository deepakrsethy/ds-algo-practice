package array.searching;

import java.util.Arrays;

public class LinearSerach {
    public static void main(String[] args) {
        int[] arr = {55,23,45,67,89,2,3,4,5};
        int target = 67;
        int index = searchTarget(arr, target);
        if(index == -1) {
            System.out.println(target+" is not found in array: "+ Arrays.toString(arr));
        } else {
            System.out.println(target+" is  found in array: "+ Arrays.toString(arr)+" at index : "+index);
        }

    }

    private static int searchTarget(int[] arr, int target) { //O(n)
        int i = 0;
        while(i < arr.length) {
            if(arr[i] == target) {
                return i;
            }
            i++;
        }
        return -1;
    }

}
