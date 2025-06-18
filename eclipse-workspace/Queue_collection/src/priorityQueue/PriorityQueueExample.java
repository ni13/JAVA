package priorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> tasks = new PriorityQueue<>();

        tasks.offer(5); // Low priority
        tasks.offer(1); // High priority
        tasks.offer(3);

        System.out.println("Most important task: " + tasks.poll());
    }
}