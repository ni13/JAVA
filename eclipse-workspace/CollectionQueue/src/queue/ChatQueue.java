package queue;

import java.util.LinkedList;

class Message {
    String text;

    public Message(String text) {
        this.text = text;
    }

    public String toString() {
        return "Message: " + text;
    }
}

public class ChatQueue {
    public static void main(String[] args) {
        LinkedList<Message> messages = new LinkedList<>();
        messages.add(new Message("Hi"));
        messages.add(new Message("How are you?"));
        messages.add(new Message("Let's meet."));

        while (!messages.isEmpty()) {
            System.out.println(messages.removeFirst());
        }
    }
}
