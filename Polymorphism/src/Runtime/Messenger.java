package Runtime;//overriding//child class implement the  methods in parent class

public class Messenger {
    void send() {
        System.out.println("Sending a generic message");
    }

    class WhatsAppMessenger extends Messenger {
        void send() {
            System.out.println("Sending via WhatsApp");
        }
    }

    class EmailMessenger extends Messenger {
        void send() {
            System.out.println("Sending via Email");
        }
    }

    public static void main(String[] args) {
        Messenger messenger;

        messenger = new Messenger().new WhatsAppMessenger();  // upcasting
        messenger.send();

        messenger = new Messenger().new EmailMessenger();     //upcasting
        messenger.send();
    }
}
