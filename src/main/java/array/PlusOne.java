package array;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9,8,9};
        int[] output = plusOne(arr);
        for(int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
        System.out.println();
        arr = new int[] {9,9,9,9};
        output = plusOne(arr);
        for(int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }

       System.out.println();
       arr =  new int[] {9};
       output = plusOne(arr);
        for(int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }

    }
    public static int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length-1; i>=0; i--){
            int sum = digits[i] + carry;
            if(sum  == 10){
                digits[i] = 0;
                carry = 1;
            }else{
                digits[i] = sum % 10;
                carry = 0;
            }
        }

        int [] op = new int[digits.length+1];
        op[0] = carry;
        for(int i = digits.length-1; i>=0; i--){
            if(carry == 0){
                return digits;
            }else{
                op[i+1] = digits[i];
            }
        }
        return op;
    }
}
