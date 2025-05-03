package array.easy;

public class FindSecondLargestElement {
    public static void main(String[] args){
        int[] nums = {11, 12,34,11,32,13, 1,2, 12, 12, 56, 76, 89, 90, 45,13, 11, 7};
        int result = findSecondLargest(nums);
        System.out.println("Second Largest: "+result);

    }
    private static int findSecondLargest(int[] nums) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Input array must contain atleast two elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            }
            if(nums[i]>secondLargest && nums[i] != largest) {
                secondLargest = nums[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element found (e.g., all elements may be equal)");
        }

        return secondLargest;
    }
}
