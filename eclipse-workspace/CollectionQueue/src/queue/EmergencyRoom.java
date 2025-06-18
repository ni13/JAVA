package queue;

import java.util.PriorityQueue;

class Patient implements Comparable<Patient> {
    String name;
    int urgency; // Higher value = more urgent

    public Patient(String name, int urgency) {
        this.name = name;
        this.urgency = urgency;
    }

    public int compareTo(Patient other) {
        return Integer.compare(other.urgency, this.urgency);
    }

    public String toString() {
        return name + " (Urgency: " + urgency + ")";
    }
}

public class EmergencyRoom {
    public static void main(String[] args) {
        PriorityQueue<Patient> queue = new PriorityQueue<>();
        queue.add(new Patient("Alice", 2));
        queue.add(new Patient("Bob", 5));
        queue.add(new Patient("Charlie", 3));

        while (!queue.isEmpty()) {
            System.out.println("Treating: " + queue.poll());
        }
    }
}
