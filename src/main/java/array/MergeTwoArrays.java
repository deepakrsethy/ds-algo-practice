package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[]  nums1 = {1,2,3,0,0,0};
        int[]  nums2 = {2,5,6};
        MergeTwoArrays mergeTwoArrays = new MergeTwoArrays();
        mergeTwoArrays.merge1(nums1, 3, nums2, 3);
        Arrays.stream(nums1).forEach(e -> System.out.print(e + " "));

    }



    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m+n];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < m && j < n) {
            if(nums1[i] < nums2[j]) {
                merged[k] = nums1[i];
                i++;
            } else {
                merged[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i < m) {
            merged[k] = nums1[i];
            k++;
            i++;
        }

        while(j < n) {
            merged[k] = nums2[j];
            k++;
            j++;
        }

        int x = 0;

        while(x < merged.length) {
            nums1[x] = merged[x];
            x++;
        }
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
