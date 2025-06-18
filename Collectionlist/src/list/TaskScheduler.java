package list;

import java.util.LinkedList;

public class TaskScheduler {
    public static void main(String[] args) {
        LinkedList<String> taskQueue = new LinkedList<>();
        taskQueue.addLast("Task 1");
        taskQueue.addLast("Task 2");
        taskQueue.addLast("Task 3");

        while (!taskQueue.isEmpty()) {
            System.out.println("Processing: " + taskQueue.removeFirst());
        }
    }
}
