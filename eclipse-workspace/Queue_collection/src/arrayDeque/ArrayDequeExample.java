package arrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.offerFirst("Start");
        deque.offerLast("End");

        System.out.println("From front: " + deque.pollFirst()); // Start
        System.out.println("From back: " + deque.pollLast());   // End
    }
}