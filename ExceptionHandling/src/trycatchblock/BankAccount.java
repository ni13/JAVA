package trycatchblock;

public class BankAccount {

    double balance = 1000.0;//private

    public void deposit(double amount) {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Deposit amount must be greater than"
                	+ " zero");
            }

            balance += amount;
            System.out.println("Successfully deposited $" + amount);

        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(-500);  // Simulate invalid deposit
    }
}