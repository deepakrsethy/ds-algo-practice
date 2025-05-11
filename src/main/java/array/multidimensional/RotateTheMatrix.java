package array.multidimensional;


import java.util.*;

public class RotateTheMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotateClockWise(matrix, 1);

        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        //findDifference(nums1, nums2);

        int[] arr1 = {1,2,2,1,1,3};
       // boolean result = uniqueOccurrences(arr1);
        //System.out.println(result);

        System.out.println(removeStars("leet**cod*e"));

        int[] ip = {5,10,-5};
        Arrays.toString(asteroidCollision(ip));

    }

    private static void rotateClockWise(int[][] matrix, int i) {
       // for(int )
        
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<Integer> list1 = new ArrayList<>();
        for(int i : nums1) {
            list1.add(i);
        }

        List<Integer> list2 = new ArrayList<>();
        for(int i : nums2) {
            list2.add(i);
        }

        List<Integer> result1 = new ArrayList<>();
        for(int n: list1){
            if(!list2.contains(n)){
                result1.add(n);
            }
        }

        List<Integer> result2 = new ArrayList<>();
        for(int n: list2){
            if(!list1.contains(n)){
                result2.add(n);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(result1);
        result.add(result2);

        return result;





    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurances = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(occurances.containsKey(arr[i])) {
                occurances.put(arr[i], occurances.get(arr[i])+1);
            } else {
                occurances.put(arr[i], 1);
            }
        }

        List<Integer> nums = new ArrayList<>(occurances.values());
        Set<Integer> uniques = new HashSet<>();
        for(int n: nums) {
            if(!uniques.add(n)) {
                return false;
            }
        }
        return true;
    }

    public static  String removeStars(String s) {
        Stack<Character> op = new Stack<>();
        char[] chars = s.toCharArray();
        int n = 0;
        for(char c: chars) {
            if(c == '*') {
               op.pop();
            }
            if(c != '*') {
                op.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();

       while(!op.isEmpty()){
           char c = op.pop();
           sb.append(c);
       }

       return sb.reverse().toString();

    }

    public static  int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> ast = new Stack<>();
        int index = 1;
        for(int i = 0; i < asteroids.length-1; i++) {
            if(asteroids[i] > 0 && asteroids[index]> 0) {
                ast.push(asteroids[i]);
            }

            if(asteroids[i] < 0 && asteroids[index]< 0) {
                ast.push(asteroids[i]);
            }

            if(asteroids[i] > 0 && asteroids[index]< 0) {
                int res = Math.max(asteroids[i], Math.abs(asteroids[index]));
                ast.push(res);
            }

            if(asteroids[i] < 0 && asteroids[index]> 0) {
                int res = Math.max(asteroids[i], Math.abs(asteroids[index]));
                ast.push(res);
            }
            index++;
        }
        List<Integer> opList = new ArrayList<>();

        while(!ast.isEmpty()) {
            opList.add(ast.pop());
        }

        int[] op = new int[opList.size()];
        int i = 0;
        while(i < opList.size()) {
            op[i] = opList.get(i);
        }
        return op;
    }
}
