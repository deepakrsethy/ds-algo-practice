package array.searching;

public class FindTheMissingElementInArray {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        int n = findMissingNum(arr);

    }

    private static int findMissingNum(int[] arr) {
        int n = arr.length+1;
        int[] frequency = new int[n+1];
        for(int i =0; i< n-1; i++){
            frequency[arr[i]] =  frequency[arr[i]]+1;
        }

        for(int i =1; i <= n; i++ ){
            if(frequency[i] == 0){
                return i;
            }
        }

        return -1;
    }
}
