package array;

public class SearchInsert {
    public static void main(String[] args) {
        int[] arr = {1};
        int target = 0;
        System.out.println(new SearchInsert().searchInsert(arr, target));


    }

    public int searchInsert(int[] nums, int target) {
        int i = 0;
        while(i < nums.length) {
            if( nums[i] == target) {
                return i;
            }
            if(nums[i] > target){
                return i;
            }

            if(nums[i]< target && nums[i+1] > target) {
                return i+1;
            }
            i++;
        }
        return nums.length;
    }
}
