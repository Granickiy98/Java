package collection.Set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Ïvan");
        stringSet.add("Oleg");
        stringSet.add("Igor");
        stringSet.add("Vlad");
        System.out.println(stringSet);

        stringSet.remove("Oleg");

        for (String s: stringSet){
            System.out.println(s);
        }

        System.out.println(stringSet.size());
        System.out.println(stringSet.isEmpty());
        System.out.println(stringSet.contains("Igor"));
    }
}
