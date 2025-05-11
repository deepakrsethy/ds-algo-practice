package array.multidimensional;

import java.util.Arrays;

public class PrintMatrix {
    public static void main(String[] args) {
        int num =1;
        int[][] arr = new int[3][3];
        for(int i = 0; i< arr.length; i++) {
            for(int j = 0; j< arr[i].length; j++) {
                arr[i][j] = num++;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        for(int i = 0; i< arr.length; i++) {
            for(int j = 0; j< arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if(j < arr[i].length-1){
                    System.out.print(",");
                }
            }
            System.out.println();
        }

    }
}
