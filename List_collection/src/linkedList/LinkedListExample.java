package linkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.addFirst("Urgent Task");

        System.out.println("First task: " + tasks.getFirst()); // Urgent Task
    }
}
