package generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(14);
        al1.add(15);
        al1.add(16);
        al1.add(17);
        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);
        ArrayList<String> al2= new ArrayList<>();
        al2.add("Hello");
        al2.add("2222");
        al2.add("abc");
        String a2 = GenMethod.getSecondElement(al2);
        System.out.println(a2);
    }
}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> arrayList){
        return arrayList.get(1);
    }
}
