package queue;

import java.util.LinkedList;

public class BrowserNavigation {
    public static void main(String[] args) {
        LinkedList<String> history = new LinkedList<>();

        history.addLast("Home");
        history.addLast("About");
        history.addLast("Contact");

        System.out.println("Current Page: " + history.removeLast()); // Contact
        System.out.println("Back to: " + history.getLast()); // About
    }
}
