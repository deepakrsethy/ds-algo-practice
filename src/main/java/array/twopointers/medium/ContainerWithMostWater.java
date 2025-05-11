package array.twopointers.medium;

import java.util.Arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        /**
         * Input: arr[] = [1, 5, 4, 3]
         * Output: 6
         * Explanation: 5 and 3 are 2 distance apart.
         * So the size of the base = 2.
         * Height of container = min(5, 3) = 3.
         * So total area = 3 * 2 = 6.
         *
         *
         * Input: arr[] = [3, 1, 2, 4, 5]
         * Output: 12
         * Explanation: 5 and 3 are distance 4 apart.
         * So the size of the base = 4.
         * Height of container = min(5, 3) = 3.
         * So total area = 4 * 3 = 12.
         *
         *
         * Input: arr[] = [2, 1, 8, 6, 4, 6, 5, 5]
         * Output: 25
         * Explanation: 8 and 5 are 5 distance apart.
         * So the size of the base = 5.
         * Height of container = min(8, 5) = 5.
         * So, total area = 5 * 5 = 25.
         */

        int[] input1 = {1, 5, 4, 3};
        System.out.println(findContainerWithMostWater(input1) == 6);
    }

    private static int findContainerWithMostWater(int[] arr) {
      int maxArea = 0;
      int left = 0;
      int right = arr.length-1;

      while (left < right) {
          int height = Math.min(arr[left], arr[right]);
          int base = right-left;
          int area = height*base;
          maxArea = Math.max(area, maxArea);
          if(arr[left] < arr[right]){
              left++;
          } else {
              right--;
          }
      }
      return maxArea;
    }
}
