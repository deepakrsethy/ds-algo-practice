package array;

public class MoveAllZerosToEndOfArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int[] op = moveZerosToEnd(arr);
        for(int i = 0; i < op.length; i++) {
            System.out.print(op[i]+" ");
        }
        System.out.println();
        op = stupidShiffter(arr);
        for(int i = 0; i < op.length; i++) {
            System.out.print(op[i]+" ");
        }
    }

    private static int[] moveZerosToEnd(int[] arr) {
        int count =0;  // Pointer to track the position for next non-zero element
        for(int i =0; i < arr.length ; i++) {
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        return arr;
    }

    private static int[] stupidShiffter(int[] arr) {
        int[] op = new int[arr.length];
        int j =0;
        for(int n: arr) {
            if(n != 0) {
                op[j] = n;
                j++;
            }
        }
        return op;
    }
}
