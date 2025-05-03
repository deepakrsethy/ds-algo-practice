package array;

import java.util.Arrays;

public class SortAnArrayInWaveForm {
    public static void main(String[] args){
        int arr[] = {10, 5, 6, 3, 2, 20, 100, 80};
        sortInWaveForm(arr);
        Arrays.stream(arr).forEach(s -> System.out.print(s+","));
    }

    private static void sortInWaveForm(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i=0; i<n-1; i += 2){
            swap(arr, i, i+1);
        }


    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
