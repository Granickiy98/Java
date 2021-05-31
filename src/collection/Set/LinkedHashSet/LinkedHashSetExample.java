package collection.Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs =  new LinkedHashSet<>();
        lhs.add(5);
        lhs.add(2);
        lhs.add(3);
        lhs.add(9);
        lhs.add(1);
        System.out.println(lhs);
        lhs.remove(5);
        System.out.println(lhs);
        System.out.println(lhs.contains(8));

    }
}
