package collection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayListOne = new ArrayList<>();
        arrayListOne.add("Renault");
        arrayListOne.add("BMW");
        arrayListOne.add("AUDI");
        arrayListOne.add("Lada");
        arrayListOne.add("Ford");
//        System.out.println("ArrayList = "+ arrayListOne);

        Iterator<String> iterator = arrayListOne.iterator();
        while(iterator.hasNext()){
            iterator.next();
          //  iterator.remove();
        }
        System.out.println(arrayListOne);
    }
}
