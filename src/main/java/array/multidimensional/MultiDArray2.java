package array.multidimensional;

import java.util.Arrays;

public class MultiDArray2 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}};
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j< arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if(j < arr[i].length-1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }

        System.out.println("**************************************");

        for(int[] row: arr) {
            for(int val : row){
                System.out.print(val+" ");
            }
            System.out.println();
        }
        System.out.println("**************************************");
        Arrays.stream(arr)
                .forEach(row ->
                        Arrays.stream(row)
                                .forEach(
                                        value ->
                                                System.out.print(value+" ")));
    }

}
