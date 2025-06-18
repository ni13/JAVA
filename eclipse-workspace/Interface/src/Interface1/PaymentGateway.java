package Interface1;

interface PaymentGateway {
    void processPayment(double amount);
    void generateReceipt();
}

class CreditCardPayment implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of ₹" + amount + "...");
    }

    public void generateReceipt() {
        System.out.println("Receipt: Credit Card Payment Successful.");
    }
}

class UPIPayment implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount + "...");
    }

    public void generateReceipt() {
        System.out.println("Receipt: UPI Payment Successful.");
    }
}

class PaymentDemo {
    public static void main(String[] args) {
        PaymentGateway payment = new UPIPayment(); // or new CreditCardPayment();
        payment.processPayment(750.00);
        payment.generateReceipt();
    }
}
