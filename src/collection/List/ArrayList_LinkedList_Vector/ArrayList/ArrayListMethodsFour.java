package collection.List.ArrayList_LinkedList_Vector.ArrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethodsFour {
    public static void main(String[] args) {
        StringBuilder stringBuilderOne = new StringBuilder("A");
        StringBuilder stringBuilderTwo = new StringBuilder("B");
        StringBuilder stringBuilderThree = new StringBuilder("C");
        StringBuilder stringBuilderFour = new StringBuilder("D");

        StringBuilder [] array = {stringBuilderOne,stringBuilderTwo,stringBuilderThree,stringBuilderFour};
        List<StringBuilder> stringBuilderList = Arrays.asList(array);
        System.out.println(stringBuilderList);

//        array[0].append("!!!");
        array[0] = new StringBuilder("F");
        System.out.println(stringBuilderList);
    }
}
