package collection.List.ArrayList_LinkedList_Vector.Vector.Stack;

import java.util.Stack;

public class StackExampleTwo {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("Yura");
        stringStack.push("Ivan");
        stringStack.push("Vlad");
        stringStack.push("Dima");
        System.out.println(stringStack);
//        while (!stringStack.isEmpty()){
//            System.out.println(stringStack.pop());
//            System.out.println(stringStack);
//        }

        System.out.println(stringStack.peek());
        System.out.println(stringStack);

    }
}
