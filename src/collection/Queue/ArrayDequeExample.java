package collection.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addFirst(5);
        deque.addLast(7);
        deque.offerFirst(3);
        deque.offerLast(8);

        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
    }
}
