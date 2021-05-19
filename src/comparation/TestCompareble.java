package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCompareble {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Yriy");
        list.add("Ivan");
        list.add("Maria");

        System.out.println("Before sorted");
        System.out.println(list);
        System.out.println("After sorted");
        Collections.sort(list);
        System.out.println(list);
    }
}
