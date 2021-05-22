package generics;

public class ParameterizedClass {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("Hello");
//        System.out.println(info1);
//        String s = info1.getValue();


        Info<Integer> info2 = new Info<>(18);
        System.out.println(info2);
        Integer s1 = info2.getValue();

    }

//    public  void abc(Info<String> info){
//        String stroka = info.getValue();
//    }
//    public  void abc (Info<Integer> info){
//        Integer number = info.getValue();
//    } Не могут существовать такие два метода так как для JVM будет стираться Generics и вид будет "public void abc(Info info)"

}

class Info<T extends  Number>{
    private T value;
    public Info(T value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}

//class Parent{
//    public  void abc(Info<String> info){
//        String stroka = info.getValue();
//    }
//}

//class Child extends Parent{
//    public  void abc(Info<Integer> info){
//        Integer stroka = info.getValue();
//    }
//}
