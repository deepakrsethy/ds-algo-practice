package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[]  nums1 = {1,2,3,0,0,0};
        int[]  nums2 = {2,5,6};
        MergeTwoArrays mergeTwoArrays = new MergeTwoArrays();
        mergeTwoArrays.merge(nums1, 3, nums2, 3);
        Arrays.stream(nums1).forEach(e -> System.out.print(e + " "));

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums1){
            if(num != 0) {
                list.add(num);
            }
        }

        for(int num : nums2){
            if(num !=0) {
                list.add(num);
            }
        }

        for(int num : list){
            System.out.println(num);
        }

        //nums1 = new int[list.size()];
        for(int i= 0; i< nums1.length; i++){
            nums1[i] = list.get(i);
        }
        Arrays.sort(nums1);

    }
}
