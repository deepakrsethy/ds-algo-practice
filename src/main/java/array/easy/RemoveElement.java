package array.easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums =  {1,1,2,3,4};
        int val = 1;

        int resultCount = removeElement(nums, val);
        System.out.println(Arrays.stream(nums).mapToObj(String::valueOf).collect(Collectors.joining(",")));
    }

    private static int removeElement(int[] nums, int val) {
        int counter = 0;
        int i = 0;
        for(int n : nums) {
            if(n != val) {
                nums[i] = n;
                counter++;
                i++;
            }
        }

        return counter;

    }
}
