package array;

import java.util.Arrays;

public class MaximumProductOfTriplet {
    public static void main(String[] args) {
        int[] arr = {-10, -3, 5, 6, -20};
        int[] nums = {10, 3, 5, 6, 20};
        System.out.println(findMaxProduct(arr));
    }

    private static int findMaxProduct(int[] nums) {
        Arrays.sort(nums);
        int max = 1;
        int i = 1;
        Math.max(nums[0]* nums[1]* nums[nums.length-1] , nums[nums.length-3]* nums[nums.length-2]* nums[nums.length-1]);
        return max;
    }
}
