package queue;

import java.util.PriorityQueue;

class Task implements Comparable<Task> {
    String name;
    int deadline; // Lower value = earlier deadline

    public Task(String name, int deadline) {
        this.name = name;
        this.deadline = deadline;
    }

    public int compareTo(Task other) {
        return Integer.compare(this.deadline, other.deadline);
    }

    public String toString() {
        return name + " (Deadline: " + deadline + ")";
    }
}

public class TaskScheduler {
    public static void main(String[] args) {
        PriorityQueue<Task> tasks = new PriorityQueue<>();
        tasks.add(new Task("Submit Report", 3));
        tasks.add(new Task("Team Meeting", 1));
        tasks.add(new Task("Code Review", 2));

        while (!tasks.isEmpty()) {
            System.out.println("Executing: " + tasks.poll());
        }
    }
}
