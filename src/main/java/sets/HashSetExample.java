package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        exploreMetodsOfASet();
    }

    private static void exploreMetodsOfASet() {
        Set<Integer> set = new HashSet<>();

        addElements(set, List.of(1,2,3,4,5,5,6,7,8,9));

        Iterator<Integer> itr = set.iterator();
        System.out.println("Set elements");
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println(set.size());

        System.out.println(set.contains(5));

        System.out.println(set.containsAll(Set.of(2,3,4)));

        System.out.println("sss"+set.containsAll(Set.of(2,3,14)));

        System.out.println(set.isEmpty());

        System.out.println(set.remove(3));
        System.out.println(set.removeAll(Set.of(4,5)));

        System.out.println(set.remove(16));

        System.out.println(set.removeAll(Set.of(8,15))); //remove whichever is present in the passed collection

        System.out.println(set.size());


        set.clear();
    }

    private static void addElements(Set<Integer> set, List<Integer> integers) {
        for(int n : integers) {
            if(set.add(n)) {
                System.out.println(n+" got added to set");
            } else {
                System.out.println(n+" did not get added to set as its a duplicate element");
            }
        }
    }
}
