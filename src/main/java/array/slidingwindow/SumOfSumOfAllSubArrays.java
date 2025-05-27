package array.slidingwindow;

public class SumOfSumOfAllSubArrays {
    public static void main(String[] args) {
        int[] arr = {2, 5, -1, 7, -3, -1, -2};
        int k =4;
        System.out.println(findSumOfSumOfAllSubArrays(arr, k));
    }

    private static int findSumOfSumOfAllSubArrays(int[] arr, int k) {
        if(k > arr.length) {
            return -1;
        }
        int totalSum = 0;
        for(int i = 0; i < k ; i++) {
            totalSum += arr[i];
        }

        int windowSum = totalSum;
        for(int i = k; i < arr.length; i++){
            windowSum = windowSum+arr[i]- arr[i-k];
            System.out.println(windowSum);
            totalSum += windowSum;
        }
        return totalSum;
    }
}
