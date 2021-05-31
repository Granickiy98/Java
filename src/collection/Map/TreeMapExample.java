package collection.Map;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Student,Double> treeMap = new TreeMap<>();
        Student st1 = new Student("Yra","Granickiy",5);
        Student st2 = new Student("Ivan","Ivanov",4);
        Student st3 = new Student("Petr","Petrov",3);
        Student st4 = new Student("Oleg","Sidorov",2);
        Student st5 = new Student("Kristina","Kostiok",2);
        Student st6 = new Student("Marina","Drezk",1);
        Student st7 = new Student("Dima","Petrov",4);
        Student st8 = new Student("Petr","Sidorov",4);
        treeMap.put(st1,5.8);
        treeMap.put(st4,7.5);
        treeMap.put(st2,6.4);
        treeMap.put(st5,7.4);
        treeMap.put(st6,6.8);
        treeMap.put(st3,7.2);
        treeMap.put(st7,9.1);
        treeMap.put(st8,9.3);
        Student st9 = new Student("Petr","Sidorov",4);
        System.out.println(treeMap);
//        System.out.println(treeMap.get(6.4));
//        treeMap.remove(5.8);
//        System.out.println(treeMap);
//        System.out.println(treeMap.descendingMap());
//        System.out.println(treeMap.tailMap(7.3));
//        System.out.println(treeMap.headMap(7.9));
//        System.out.println(treeMap.lastEntry());
//        System.out.println(treeMap.firstEntry());
    }
}
