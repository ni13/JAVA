package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a queue of strings
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");

        // Display the front element without removing
        System.out.println("Front of queue: " + queue.peek());

        // Remove and display elements in FIFO order
        while (!queue.isEmpty()) {
            System.out.println("Removed: " + queue.poll());
        }

        // Queue is now empty
        System.out.println("Queue empty: " + queue.isEmpty());
    }
}