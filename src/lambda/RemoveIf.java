package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Hello");
        al.add("Bay");
        al.add("Ok");
        al.add("Learn Java");
        al.add("Lambda");

        al.removeIf(element -> element.length()<5);
        System.out.println(al);

    }
}
