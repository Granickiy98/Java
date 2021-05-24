package collection.List.ArrayList_LinkedList_Vector.ArrayList;

import java.util.ArrayList;

public class ArrayListMethodsThree {
    public static void main(String[] args) {
        ArrayList<String> arrayListOne = new ArrayList<>();
        arrayListOne.add("Renault");
        arrayListOne.add("BMW");
        arrayListOne.add("AUDI");
        arrayListOne.add("BMW");
        System.out.println(arrayListOne);

//        ArrayList<String> arrayListTwo = new ArrayList<>();
//        arrayListTwo.add("ÖpelLLL");
//        arrayListTwo.add("Dacha?????");
//
//        arrayListOne.addAll(1,arrayListTwo);
//        System.out.println();
//        System.out.println(arrayListOne);
//        arrayListOne.clear();
        System.out.println(arrayListOne.lastIndexOf("BMW"));
        System.out.println("Size List: "+arrayListOne.size());
        System.out.println("Empty?: "+arrayListOne.isEmpty());
        System.out.println("It is: "+arrayListOne.contains("BMW"));

    }
}
