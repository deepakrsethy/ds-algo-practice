package array.multidimensional;

public class MultiDimensional {
    public static void main(String[] args) {
        int[][] arr = new int[1][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
       // System.out.println(arr.length); // always gives value of first

        for(int i= 0; i < arr.length; i++) {
            for(int j =0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+",");
            }
        }
    }
}
