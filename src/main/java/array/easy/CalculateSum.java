package array.easy;

import java.util.Arrays;

public class CalculateSum {
    public static void main(String[] args){
        int[] nums = {10,20,30,40,50,60,70,80,90,100};
        int sum = findSum(nums);
        System.out.println("Sum ="+sum);
        System.out.println(findSumUsingStream(nums));
    }
    private static int findSumUsingStream(int[] nums) {
        if(nums == null) {
            throw new IllegalArgumentException("Input Array cannot be null");
        }
       return Arrays.stream(nums).sum();
    }
    private static int findSum(int[] nums) {
        if(nums == null) {
            throw new IllegalArgumentException("Input Array cannot be null");
        }
        int sum = 0;
        for(int n: nums) {
            sum = sum + n;
        }
        return sum;
    }
}
