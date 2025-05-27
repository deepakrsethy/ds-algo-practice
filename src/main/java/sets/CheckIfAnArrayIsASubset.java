package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckIfAnArrayIsASubset {
    public static void main(String[] args) {
        int[] a = {11,1,12,21,3,7};
        int[] b = {11,3,7,1};
        boolean result = checkIfSubset(a,b);
        System.out.println(result);
    }


    private static boolean checkIfSubset(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        Arrays.stream(a).forEach(set::add);
        for(int n : b) {
            if(!set.contains(n)){
                return false;
            }
        }
        return true;
    }
}
