package Runtime;

public class PaymentRuntime {
    void pay() {
        System.out.println("Generic payment processed");
    }
}

class CreditCardPayment extends PaymentRuntime {
    void pay() {
        System.out.println("Payment done via Credit Card");
    }
}

class UPIPayment extends PaymentRuntime {
    void pay() {
        System.out.println("Payment done via UPI");
    }
    public static void main(String[] args) {
        PaymentRuntime payment;

        payment = new CreditCardPayment(); // Upcasting
        payment.pay(); // Calls CreditCardPayment's pay()

        payment = new UPIPayment(); // Upcasting
        payment.pay(); //Calls UPIpayment's pay()
    }
    }