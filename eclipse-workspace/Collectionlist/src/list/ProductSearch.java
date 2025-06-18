package list;

import java.util.Scanner;

public class ProductSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of products
        System.out.print("Enter number of products: ");
        int n = scanner.nextInt();
        int[] productIds = new int[n];

        // Input: Product IDs
        System.out.println("Enter sorted product IDs:");
        for (int i = 0; i < n; i++) {
            productIds[i] = scanner.nextInt();
        }

        // Input: Product ID to search
        System.out.print("Enter product ID to search: ");
        int target = scanner.nextInt();

        // Binary Search
        int left = 0, right = n - 1, position = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (productIds[mid] == target) {
                position = mid;
                break;
            } else if (productIds[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (position != -1)
            System.out.println("Product found at index: " + position);
        else
            System.out.println("Product not found.");

        scanner.close();
    }
}
