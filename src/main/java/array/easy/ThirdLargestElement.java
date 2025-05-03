package array.easy;

public class ThirdLargestElement {
    public static void main(String[] args) {
        int[] arr = {12,22, 1, 35,10, 34, 1};
        int secondLargest1 = findThirdLargest(arr);
        System.out.println(secondLargest1);
    }

    private static int findThirdLargest(int[] arr) {
        int largest = 0;
        int secondLargest  = 0;
        int thirdLargest  = 0;
        for(int n : arr){
            if(n > largest){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = n;
            } else if (n > secondLargest && n != largest){
                thirdLargest = secondLargest;
                secondLargest = n;
            }  else if (n > thirdLargest && n != secondLargest && n != largest){
                thirdLargest = n;
            }
        }
        return thirdLargest;
    }
}
