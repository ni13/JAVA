package Inheritance;
import java.util.Scanner;

public class Account {
    double balance;

    void showBalance() {
        System.out.println("Current balance: ₹" + balance);
    }
}

class SavingsAccount extends Account {
    void addInterest() {
        balance += balance * 0.05;
        System.out.println("Interest added. New balance: ₹" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SavingsAccount sa = new SavingsAccount();

        System.out.print("Enter initial balance: ₹");
        sa.balance = scanner.nextDouble();

        sa.showBalance();
        sa.addInterest();

        scanner.close();
    }
}