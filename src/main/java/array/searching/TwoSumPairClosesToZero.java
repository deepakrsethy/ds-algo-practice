package array.searching;

public class TwoSumPairClosesToZero {
    public static void main(String[] args) {
        /*
    Input: arr[] = [-8, 5, 2, -6]
    Output: -1
    Explanation: The min absolute sum pair is (5, -6)
    */
        twoSumPairClosesToZero(new int[]{-8, 5, 2, -6});
    }

    private static void twoSumPairClosesToZero(int[] arr) {
        int left = 0;
        int right = 1;
        int sum = 1;
        while (left < right) {
            int s = arr[left]+arr[right];
            //sum = Math.min(sum)
        }
    }



    /*Input:  arr[] = [0, -8, -6, 3]
    Output: 3
    Explanation: We have a tie between (0, 3) and (-6, 3). We pick the max sum in this case which is 0+3
    */

    /*Input: arr[] = [-7, 4, 1, -2]
    Output: -1
    Explanation: The min absolute sum pair is (4, -5).*/


}
