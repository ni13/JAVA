package Encapsulation;

import java.util.Scanner;

public class BankAccount {
    // Encapsulated fields
    private String accountHolder;
    private double balance;

    // Setter for account holder
    public void setAccountHolder(String name) {
        this.accountHolder = name;
    }
    // Getter for account holder
    public String getAccountHolder() {
        return accountHolder;
    }
    // Setter for balance with validation
    public void setBalance(double amount) {
        if (amount >= 0) {
            this.balance = amount;
        } else {
            System.out.println("Invalid balance amount.");
        }
    }
    // Getter for balance
    public double getBalance() {
        return balance;
    }
    // Main method for dynamic input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();
        // Get user input dynamically
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();
        account.setAccountHolder(name);
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        account.setBalance(initialBalance);
        // Display account details
        System.out.println("\nAccount Details:");
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: $" + account.getBalance());

        scanner.close();
    }


}