package list;

import java.util.Scanner;

public class StudentRollSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        int[] rollNumbers = new int[n];

        // Input: Roll numbers
        System.out.println("Enter the roll numbers:");
        for (int i = 0; i < n; i++) {
            rollNumbers[i] = scanner.nextInt();
        }

        // Input: Target roll number to search
        System.out.print("Enter the roll number to search: ");
        int target = scanner.nextInt();

        // Linear Search
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (rollNumbers[i] == target) {
                System.out.println("Roll number found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Roll number not found.");
        }

        scanner.close();
    }
}
