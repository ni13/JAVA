package queue;

import java.util.LinkedList;
import java.util.Queue;

class Ticket {
    String issue;

    public Ticket(String issue) {
        this.issue = issue;
    }

    public String toString() {
        return "Ticket: " + issue;
    }
}

public class SupportQueue {
    public static void main(String[] args) {
        Queue<Ticket> tickets = new LinkedList<>();
        tickets.add(new Ticket("Login Issue"));
        tickets.add(new Ticket("Payment Failed"));
        tickets.add(new Ticket("Account Locked"));

        while (!tickets.isEmpty()) {
            System.out.println("Handling: " + tickets.poll());
        }
    }
}
