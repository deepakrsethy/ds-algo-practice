package array;

public class RotateAnArray {
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6};
        int d = 2;
        rotateAnArrayByD(arr, d);
        for(int n: arr) {
            System.out.print(n+",");
        }
    }

    private static void rotateAnArrayByD(int[] arr, int d) {
        int i = 0;
        while(i < d){
            int first = arr[0];
            int pos = 1;
            while (pos < arr.length) {
                arr[pos-1] = arr[pos];
                pos++;
            }
            arr[arr.length-1] = first;
            i++;
        }
    }


}
