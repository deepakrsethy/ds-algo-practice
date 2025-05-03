package array;

public class ReverseSubArray {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        int[] reversed = reverseSubArrays(arr, k);
        for(int n: reversed) {
            System.out.print(n+" ");
        }
    }
    private static int[] reverseSubArrays(int[] arr, int k) {
        for(int i = 0; i < arr.length ; i= i+k) {
            int left = i;
            int right = i+k-1;

            while (left < right) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
                right--;
            }
        }
        return arr;
    }
}
