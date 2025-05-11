package string;

import java.util.Stack;

public class FindEqualPointInAStringOfBrackets {

    public static void main(String[] args) {
        /**
         * Given a string of brackets, the task is to find an index k which decides the number of opening brackets is equal to the number of closing brackets.
         * The string must be consists of only opening and closing brackets i.e. ‘(‘ and ‘)’.
         *
         * An equal point is an index such that the number of opening brackets before it is equal to the number of closing brackets from and after.
         * If multiple such points exist then return the first valid index and if no such index exists then return -1.
         */
        String brackets = "((())))(";
        int point = findEqualPoint(brackets);
        System.out.println(point);

    }

    private static int findEqualPoint(String brackets) {
        int result = 0;
        Stack<Character> bracketStack = new Stack<>();
        int counter = 1;
        for(char c: brackets.toCharArray()) {
            if(c == '(') {
                bracketStack.push(c);
            } else if ( c == ')' && !bracketStack.isEmpty()){
                bracketStack.pop();
                if(bracketStack.isEmpty()) {
                    result = counter;
                }
            }
            counter++;


        }

        return result > 0 ? result : -1;
    }
}
