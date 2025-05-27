package array.slidingwindow;

public class FindMaxSumOfAllSubArrays {
    public static void main(String[] args) {
        int[] arr = {1,4,2,10,23,3,1,0,20};
        int k = 4;
        System.out.println(findMaxSumOfAllSubArrayOfSizeK(arr, k));

    }

    private static int findMaxSumOfAllSubArrayOfSizeK(int[] arr, int k) {
        int maxSum = 0;
        for(int i = 0; i < k ; i++) {
            maxSum += arr[i]; //sum of first k elements or first window
        }

        int windowSum = maxSum;
        for(int i = k; i< arr.length; i++) {
            windowSum = windowSum+ arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;

    }
}
