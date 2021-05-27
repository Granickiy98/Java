package collection.List.ArrayList_LinkedList_Vector.Vector.Stack;

public class StackExample {
    static void abc1(){
        System.out.println("abc1 start");
        System.out.println("abc1 ends");
    }
    static void abc2(){
        System.out.println("abc2 start");
        abc1();
        System.out.println("abc2 ends");
    }
    static void abc3(){
        System.out.println("abc3 start");
        abc2();
        System.out.println("abc3 ends");
    }

    public static void main(String[] args) {
        System.out.println("MAIN STARTS");
        abc3();
        System.out.println("MAIN ENDS");
    }
}
