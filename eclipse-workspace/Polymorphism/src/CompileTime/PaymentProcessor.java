package CompileTime;

public class PaymentProcessor {
    // Method 1: Pay by amount only
    void makePayment(double amount) {
        System.out.println("Paid $" + amount);
    }

    // Method 2: Pay by amount and currency
    void makePayment(double amount, String currency) {
        System.out.println("Paid " + currency + amount);
    }

    // Method 3: Pay by amount and discount
    void makePayment(double amount, double discount) {
        double finalAmount = amount - discount;
        System.out.println("Paid $" + finalAmount + " after discount");
    }

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.makePayment(100);              // Calls method 1
        processor.makePayment(200, "$");         // Calls method 2
        processor.makePayment(500, 50);          // Calls method 3
    }
}