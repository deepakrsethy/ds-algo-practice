package array.searching;

public class CountOnes {
    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 0, 0, 0, 0};
        int count = countOnes(arr);
        System.out.println("Count of 1s: "+count);
    }

    private static int countOnes(int[] arr) {
        int count = 0;
        for(int i=0; i < arr.length; i++) {
            if(arr[i] == 1) {
                count++;
            } else {
                break; // sorted array, so no need to iterate for zeros.
            }
        }
        return count;
    }

    private static int countOnesUsingBinarySearch(int[] arr){
        int n = arr.length;
        int low = 0, high = n - 1;

        // get the middle index
        while (low <= high) {
            int mid = (low + high) / 2;

            // If mid element is 0
            if (arr[mid] == 0)
                high = mid - 1;

                // If element is last 1
            else if (mid == n - 1 || arr[mid + 1] != 1)
                return mid + 1;

                // If element is not last 1
            else
                low = mid + 1;
        }
        return 0;
    }
}
