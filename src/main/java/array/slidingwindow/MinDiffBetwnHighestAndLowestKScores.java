package array.slidingwindow;

import java.util.Arrays;

public class MinDiffBetwnHighestAndLowestKScores {
    public static void main(String[] args) {
        int[] arr = {20, 200,300, 1000 };
        int k = 3;
        System.out.println(minimumDifference(arr, k));

    }
    public static int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int minScoreDiff = Integer.MAX_VALUE;

        int i = 0;
        int j = k-1;
        while(j < nums.length) {
            int diff = nums[j] - nums[i];
            minScoreDiff = Math.min(minScoreDiff, diff);
            i++;
            j++;
        }
        return minScoreDiff;

    }
}
