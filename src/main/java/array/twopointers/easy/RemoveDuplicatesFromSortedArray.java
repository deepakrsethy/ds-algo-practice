package array.twopointers.easy;

/**
 * Remove duplicates from a sorted array
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,6,8,9,9};
        int indexTillUnique = removeDuplicates(arr);
        for(int i = 0; i < indexTillUnique; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    /**
     * Remove duplicates from a sorted array
     * @param arr the array from which duplicates need to be removed
     * @return return the index till which the unique elements are present
     */
    private static int removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int i = 0;
        for(int j = 1; j < arr.length; j++) {
            if(arr[j] > arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}

