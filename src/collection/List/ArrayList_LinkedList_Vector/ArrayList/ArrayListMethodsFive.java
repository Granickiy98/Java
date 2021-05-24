package collection.List.ArrayList_LinkedList_Vector.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethodsFive {
    public static void main(String[] args) {
        ArrayList<String> arrayListOne = new ArrayList<>();
        arrayListOne.add("Renault");
        arrayListOne.add("BMW");
        arrayListOne.add("AUDI");
        arrayListOne.add("Lada");
        arrayListOne.add("Ford");
        System.out.println("ArrayList = "+ arrayListOne);

        List<Integer> list1 = List.of(3,8,13);
        System.out.println(list1);


        List<String> list2 = List.copyOf(arrayListOne);
        System.out.println(list2);



//        Object[] array =arrayListOne.toArray();
//        String[] array2 = arrayListOne.toArray(new String [0]);
//
//        for (String s:array2){
//            System.out.println(s);
//        }

//        List<String> myList = arrayListOne.subList(0,3);

//        ArrayList<String> arrayListTwo = new ArrayList<>();
//        arrayListTwo.add("Renault");
//        arrayListTwo.add("BMW");
//        arrayListTwo.add("LADA");
//        arrayListOne.retainAll(arrayListTwo);
//        System.out.println("Sub List= "+myList);
//        myList.add("Fiat");
//        System.out.println("Sub List = " + myList);
//        System.out.println("Array List = "+arrayListOne);
//
//        arrayListOne.add("Opel");
//        System.out.println("Array List = "+ arrayListOne);
//        System.out.println("Sub List = " + myList);
//        boolean result = arrayListOne.containsAll(arrayListTwo);
//        System.out.println(arrayListOne);
//        System.out.println(result);

//        arrayListOne.removeAll(arrayListTwo);


    }
}
