package list;

import java.util.Scanner;

public class BookSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of books
        System.out.print("Enter number of books: ");
        int n = Integer.parseInt(scanner.nextLine());
        String[] books = new String[n];

        // Input: Book titles
        System.out.println("Enter book titles:");
        for (int i = 0; i < n; i++) {
            books[i] = scanner.nextLine();
        }

        // Input: Target book title
        System.out.print("Enter the book title to search: ");
        String target = scanner.nextLine();

        // Linear Search
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (books[i].equalsIgnoreCase(target)) {
                System.out.println("Book found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }

        scanner.close();
    }
}
