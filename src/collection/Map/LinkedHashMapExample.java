package collection.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Double,Student> lhm = new LinkedHashMap<>(16,0.75f,true);
        Student st1 = new Student("Yra","Granickiy",5);
        Student st2 = new Student("Ivan","Ivanov",4);
        Student st3 = new Student("Petr","Petrov",3);
        Student st4 = new Student("Oleg","Sidorov",2);

        lhm.put(5.8,st1);
        lhm.put(7.5,st4);
        lhm.put(6.4,st2);
        lhm.put(5.6,st3);

        System.out.println(lhm);

        System.out.println(lhm.get(5.8));
        System.out.println(lhm.get(6.4));

        System.out.println(lhm);
    }
}
