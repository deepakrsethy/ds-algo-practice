package array.easy;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEvenAndOddNumbers {
    public static void main(String[] args){
        int [] nums = {243, 11, 22, 44, 5, 7, 88, 91, 0, 92};
        countEvenAndOddNumbers(nums);
        countEvenAndOddNumbersUsingStream(nums);
        checkIfNumberIsEvenOrOdd(nums);
    }

    private static void checkIfNumberIsEvenOrOdd(int[] nums) {
        Arrays.stream(nums).forEach(
                num -> {
                    if(num % 2 == 0) {
                        System.out.println(num +": even");
                    } else {
                        System.out.println(num +": odd");
                    }
                }
        );
    }

    private static void countEvenAndOddNumbersUsingStream(int[] nums) {
        Map<Boolean, Long> counts = Arrays.stream(nums).boxed()
                        .collect(Collectors.partitioningBy(n -> n%2 == 0, Collectors.counting()));
        System.out.println(String.format("Even Count: %d and Odd Count: %d", counts.get(true), counts.get(false)));
    }

    private static void countEvenAndOddNumbers(int[] nums) {
        if(nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty");
        }
        int evenCount = 0;
        int oddCount = 0;
        for(int num : nums) {
            if(num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even Count: "+evenCount+" and Odd Count: "+oddCount);
    }


}
