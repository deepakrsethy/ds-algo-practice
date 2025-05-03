package array.easy;

public class LinearSearchInAnArray {
    public static void main(String[] args){
        int [] arr = {11, 23, -56, 33, 22, 11, 6, 23};
        int num = 6;
        int index = findElement(arr, num);
        System.out.println(index);
    }

    private static int findElement(int[] arr, int num) {
        if(arr == null) {
            throw new IllegalArgumentException("Input array can not be null");
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
