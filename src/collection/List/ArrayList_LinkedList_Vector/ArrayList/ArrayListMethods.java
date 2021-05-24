package collection.List.ArrayList_LinkedList_Vector.ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> arrayListOne = new ArrayList<>();
        arrayListOne.add("Jon");
        arrayListOne.add("Ivan");
        arrayListOne.add("Marik");
        arrayListOne.add("Nik");
        arrayListOne.add(3,"Viola");
        arrayListOne.add(5,"Misha");

        for (String s : arrayListOne){
            System.out.print(s+" ");
        }
        System.out.println();
//        ArrayList<Integer> arrayListTwo = new ArrayList<>();
//        arrayListTwo.add(6);
//        for (int s : arrayListTwo){
//            System.out.print(s+" ");
//        }
        for (int i = 0;i<arrayListOne.size();i++){
            System.out.print(arrayListOne.get(i));
        }
//        System.out.println(arrayListOne.get(3));
        System.out.println();
        arrayListOne.set(1,"Masha");
        arrayListOne.remove(0);

        System.out.println(arrayListOne);
    }
}
