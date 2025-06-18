package Sort;

public class ECommerceProductSorting {

    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // choosing last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap pivot to the correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] prices = {499, 299, 999, 150, 750};

        System.out.println("Before sorting:");
        for (int price : prices) System.out.print(price + " ");

        quickSort(prices, 0, prices.length - 1);

        System.out.println("\nAfter sorting by price (Low to High):");
        for (int price : prices) System.out.print(price + " ");
    }
}


