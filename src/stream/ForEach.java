package stream;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] array = {5,9,3,8,1};
        Arrays.stream(array).forEach(value -> {value*=2;
            System.out.println(value);});
        System.out.println("-----------------");
        Arrays.stream(array).forEach(value -> System.out.println(value));
        System.out.println("-----------------");
        Arrays.stream(array).forEach(Uttils::myMethod);
    }
}


class Uttils{
    public static void myMethod(int a){
        a=a+5;
        System.out.println("Element = "+a);
    }
}