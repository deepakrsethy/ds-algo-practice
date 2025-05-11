package array.twopointers.easy;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,8,11,22,33};
        int target = 33;
        int[] result = findTwoSum(arr, target);
        System.out.println(result[0] +" "+result[1]);
    }

    private static int[] findTwoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length -1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if(sum == target) {
                return new int[] {arr[left], arr[right]};
            } else if(sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {-1, -1};
    }
}
