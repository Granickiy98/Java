package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);


     int result =   list.stream().reduce((accumulator,element)->
                accumulator*element).get();

        System.out.println(result);
//        5,8,2,4,3
//        accumulator = 5  40  80   320     960
//        element = 8      2    4   3
        int result2 =   list.stream().reduce(1,(accumulator,element)->
                accumulator*element);
        //        accumulator = 1 5 40 80 320 960
        //        element =     5 8 2   4 3

        System.out.println(result2);

        List<String> list3 = new ArrayList<>();
        list3.add("hello");
        list3.add("OK");
        list3.add("How are you");
        list3.add("goodbay");

        String result3 = list3.stream().reduce((a,e)->
                a+" "+e).get();
        System.out.println(result3);
//        List<Integer> list1100 = new ArrayList<>();
//        Optional<Integer> all =  list.stream().reduce((accumulator, element)->
//                accumulator*element);
//        if(all.isPresent()){
//            System.out.println(all.get());
//        }else {
//            System.out.println("Not Present");
//        }

    }
}
