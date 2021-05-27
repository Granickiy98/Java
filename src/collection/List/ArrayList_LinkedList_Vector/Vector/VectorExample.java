package collection.List.ArrayList_LinkedList_Vector.Vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> stringVector = new Vector<>();
        stringVector.add("Ivan");
        stringVector.add("Vlad");
        stringVector.add("Yra");
        stringVector.add("Bob");
        stringVector.add("Kristina");
        System.out.println(stringVector);
        System.out.println(stringVector.firstElement());
        System.out.println(stringVector.lastElement());
        stringVector.remove(2);
        System.out.println(stringVector);
        System.out.println(stringVector.get(1));
   }
}
