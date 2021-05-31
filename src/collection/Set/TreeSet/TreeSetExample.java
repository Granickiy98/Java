package collection.Set.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(8);
        set.add(2);
        set.add(1);
        set.add(10);

        set.remove(2);
        System.out.println(set);
        System.out.println(set.contains(1));
        System.out.println(set.contains(2));

    }
}
