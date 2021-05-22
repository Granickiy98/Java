package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("OK");
//        list.add(12);
//        list.add(new StringBuilder());
//        list.add(new Car());

        list.add("Hiy");
        list.add("Goodbay");
        list.add("ok");
        list.add("Hello");

        for (Object o: list) {
            System.out.println(o+" length" + ((String)o).length());
        }

    }
}

class Car{

}
