package array.easy;

public class FindMaxAndMinInAnArray {
    public static void main(String[] args){
        int [] arr = {11, 23, -56, 33, 22, 11, 6, 23};
        int[] maxAndMin = findMaxAndMin(arr);
        System.out.println("Max: "+maxAndMin[0]+" and Min: "+maxAndMin[1]);
    }

    private static int[] findMaxAndMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input Array can not be null or empty");
        }

        int max = arr[0];
        int min = arr[0];

        for(int num : arr){
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return new int[] {max, min};
    }
}
