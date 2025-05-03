import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(4,2,1,2);
        List<Integer> list2 = List.of(2,1,5,2,3);
        System.out.println(findMinOps(list1, list2));
    }

    private static int findMinOps(List<Integer> list1, List<Integer> list2) {
        int n = list1.size();
        int minOps = Integer.MAX_VALUE;

        for(int i = 0; i < n ; i++) {
            List<Integer> newList1 = new ArrayList<>(list1);
            newList1.add(list1.get(i));

            List<Integer> sortedNewList1 = new ArrayList<>(newList1);
            List<Integer> sortedList2 = new ArrayList<>(list2);
            Collections.sort(sortedNewList1);
            Collections.sort(sortedList2);

            int ops = 1;
            for(int j = 0; j<=n; j++){
                ops += Math.abs(sortedNewList1.get(j) - sortedList2.get(j));
            }
            minOps = Math.min(minOps, ops);

        }
        return minOps;
    }
}
