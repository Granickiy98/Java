package collection.List.ArrayList_LinkedList_Vector.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExampleOne {
    public static void main(String[] args) {
        ArrayList<String> arrayListOne = new ArrayList<>();
        arrayListOne.add("Jon");
        arrayListOne.add("Ivan");
        arrayListOne.add("Marik");
        arrayListOne.add("Nik");
        System.out.println(arrayListOne);

        ArrayList<String> arrayListTwo = new ArrayList<>(200);
        arrayListTwo.add("George");
        arrayListTwo.add("Ivan");
        List<String> arrayListThree = new ArrayList<>();

        ArrayList<String> arrayListFree = new ArrayList<>(arrayListOne);
        System.out.println(arrayListFree);
        System.out.println(arrayListFree == arrayListOne);
    }
}
