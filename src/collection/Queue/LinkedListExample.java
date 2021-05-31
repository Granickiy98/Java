package collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Ivan");
        queue.offer("Vlad");
        queue.offer("Petr");
        queue.offer("Dima");

        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.element());
    }
}
