package array.slidingwindow;

import java.util.List;

public class MinPositiveSumSubArray {
    public static void main(String[] args) {
        System.out.println(minimumSumSubarray(List.of(4,-10), 1, 1));
    }

    public static int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minSum = Integer.MAX_VALUE;
        while(l <= r) {
            int sum = findMinSum(nums, l++);
            minSum = Math.min(minSum, sum);
        }
        return minSum != Integer.MAX_VALUE ? minSum : -1;

    }
    private static int findMinSum(List<Integer> nums, int k) {
        int minSum = Integer.MAX_VALUE;

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum  += nums.get(i);
        }

        if(windowSum > 0) {
            minSum = Math.min(minSum, windowSum);
        }

        for(int i= k; i < nums.size(); i++){
            windowSum = windowSum+nums.get(i)-nums.get(i-k);
            if(windowSum > 0) {
                minSum = Math.min(minSum, windowSum);
            }
        }
        return minSum;
    }
}
