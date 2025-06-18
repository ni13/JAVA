package list;

import java.util.Scanner;

public class StudentNameSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of students
        System.out.print("Enter number of students: ");
        int n = Integer.parseInt(scanner.nextLine());
        String[] students = new String[n];

        // Input: Student names
        System.out.println("Enter student names (in sorted order):");
        for (int i = 0; i < n; i++) {
            students[i] = scanner.nextLine();
        }

        // Input: Name to search
        System.out.print("Enter name to search: ");
        String target = scanner.nextLine();

        // Binary Search
        int left = 0, right = n - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = students[mid].compareToIgnoreCase(target);

            if (cmp == 0) {
                System.out.println("Student found at index: " + mid);
                found = true;
                break;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        scanner.close();
    }
}
