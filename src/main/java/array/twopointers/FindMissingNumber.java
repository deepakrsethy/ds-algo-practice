package array.twopointers;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,11};
        System.out.println(findMissingNumber(arr));
    }
    private static int findMissingNumber(int[] arr) {
        int i = 0;
        for(int j = 1; j < arr.length; j++) {
            if(arr[j] -1 != arr[i]) {
                return arr[j]-1;
            }
            i++;
        }
        return -1;
    }
}
