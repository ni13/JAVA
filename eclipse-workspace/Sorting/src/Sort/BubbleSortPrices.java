package Sort;

public class BubbleSortPrices {
    public static void main(String[] args) {
        double[] prices = {199.99, 49.99, 89.50, 149.25, 79.99};

        bubbleSort(prices);

        System.out.println("Sorted Product Prices:");
        for (double price : prices) {
            System.out.print(price + " ");
        }
    }

    public static void bubbleSort(double[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }
}
