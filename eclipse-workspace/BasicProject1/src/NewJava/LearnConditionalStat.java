package NewJava;

public class LearnConditionalStat {

    public static void main(String[] args) {
        // Part 1: PIN validation
        int enterPIN = 1234;
        int correctPIN = 1234;

        if (enterPIN == correctPIN) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Enter the correct Password");
        }

        // Part 2: Grade calculation
        int marks = 85;

        if (marks >= 40) {
            if (marks >= 90) {
                System.out.println("Grade A");
            } else if (marks >= 75) {
                System.out.println("Grade B");
            } else {
                System.out.println("Grade C");
            }
        } else {
            System.out.println("Fail");
        }
    }
}

