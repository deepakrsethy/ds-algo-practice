package array.slidingwindow;

import java.util.Arrays;

public class LongestHarmoniumSequence {
    public static void main(String[] args) {
        int[] nums = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }

    public static int findLHS(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        int i =0;
        int j = 1;
        while(i < j && j < nums.length) {
            int diff = Math.abs(nums[j]-nums[i]);
            if(diff == 1){
                result++;
            }
            i++;
            j++;
        }
        return result;

    }
}
