package generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardsTest {
    public static void main(String[] args) {
        List<?> list = new ArrayList<Integer>();

      //  list.add("Hello");

        List<? extends Number> list30= new ArrayList<>();
        List<? super Number> list31= new ArrayList<Object>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("AUDI");
        list2.add("BMW");
        list2.add("MERCEDES");
        showListInfo(list2);

        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(3.45);
        arrayList.add(3.25);
        arrayList.add(2.65);
        System.out.println("Sum arrayList: "+sum(arrayList));
    }

    static void showListInfo(List<?> list){
        System.out.println("My list have elements: "+list);
    }

    public static double sum(ArrayList<? extends Number> arrayList ){
        double summ = 0 ;
        for (Number n : arrayList){
            summ+=n.doubleValue();
        }
        return summ;
    }
}
