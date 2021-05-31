package collection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExampleOne {
    public static void main(String[] args) {
        Map<Integer,String> mapOne = new HashMap<>();
        mapOne.put(1000,"Yura Granitskiy");
        mapOne.put(1002,"Ivan Ivanov");
        mapOne.put(1003,"Vlad Petrov");
        mapOne.put(1001,"Petr Sidorov");
        mapOne.putIfAbsent(1000,"Petr Volod");
        System.out.println(mapOne);
        System.out.println(mapOne.get(1001));
        mapOne.remove(1001);
        System.out.println(mapOne);
        System.out.println(mapOne.containsValue("Ivan Ivano"));
        System.out.println(mapOne.containsKey(1000));
        System.out.println(mapOne.keySet());
        System.out.println(mapOne.values());

        Map<String,String> mapTwo = new HashMap<>();
        mapTwo.put("Granickiy","Yriy");
        System.out.println(mapTwo);

    }
}
