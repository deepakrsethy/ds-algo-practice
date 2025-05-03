package array.easy;

public class CheckIfArrayIsSorted {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5,6,7,2};
        System.out.println(checkSorted(arr1));

        int[] arr2 = {1,2,6,4,5,6,7,2};
        System.out.println(checkSorted(arr2));

        int[] arr3 = {1,2,3,4,4,5,6,7,2};
        System.out.println(checkSorted(arr3));

        int[] arr4 = {1,2,3,4,4,5,6,7};
        System.out.println(checkSorted(arr4));

        int[] arr5 = {1,2,3,4,5,6,7};
        System.out.println(checkSorted(arr5));

        int[] arr6 = {1};
        System.out.println(checkSorted(arr6));
    }

    private static boolean checkSorted(int[] arr) {
        if(arr == null) {
            throw new IllegalArgumentException("Input array can not be null");
        }
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
