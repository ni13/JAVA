package Sort;


public class TransactionSorting {

    public static void quickSortDescending(int[] transactions, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(transactions, low, high);
            quickSortDescending(transactions, low, pivotIndex - 1);
            quickSortDescending(transactions, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] > pivot) { // descending order
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap pivot
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] transactions = {1200, 4500, 3200, 2200, 1800};

        System.out.println("Before sorting:");
        for (int amount : transactions) System.out.print(amount + " ");

        quickSortDescending(transactions, 0, transactions.length - 1);

        System.out.println("\nAfter sorting by transaction amount (High to Low):");
        for (int amount : transactions) System.out.print(amount + " ");
    }
}

