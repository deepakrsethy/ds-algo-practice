package array.easy;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.function.DoubleConsumer;

public class FindAverage {
    public static void main(String[] args){
        int[] nums = {10,20,30,40,50,60,70,80,90,100};
        System.out.println("Sum ="+findAverage(nums));
        System.out.println(findAverageUsingStream(nums));
    }
    private static double findAverageUsingStream(int[] nums) {
        if(nums == null) {
            throw new IllegalArgumentException("Input Array cannot be null");
        }
        return Arrays
                .stream(nums)
                .average()
                .orElseThrow(
                        () -> new IllegalArgumentException("Array cannot be empty"));

    }
    private static double findAverage(int[] nums) {
        if(nums == null) {
            throw new IllegalArgumentException("Input Array cannot be null");
        }
        int sum = 0;
        for(int n: nums) {
            sum = sum + n;
        }
        return (double) sum/nums.length;
    }
}
