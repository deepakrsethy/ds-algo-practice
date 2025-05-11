package array.twopointers.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int target = 13;
        boolean result = findThreeSum(arr, target);
        System.out.println(result);
    }

    private static boolean findThreeSum(int[] arr, int target) {
        if (arr.length < 3) {
            return false;
        }

        Arrays.sort(arr);
        for(int i =0; i< arr.length; i++) {
            int targetSum = target - arr[i];
            int left = i+1;
            int right = arr.length-1;
            while(left<right) {
                int sum = arr[left]+arr[right];
                if(sum == targetSum) {
                    return true;
                } else if (sum < targetSum) {
                    left++;
                } else {
                    right--;
                }
            }

        }
        return false;
    }
}
