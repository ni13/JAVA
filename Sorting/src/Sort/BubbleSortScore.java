package Sort;

public class BubbleSortScore {
    public static void main(String[] args) {
        int[] scores = {88, 75, 90, 67, 92};

        bubbleSort(scores);

        System.out.println("Sorted Scores:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break; // optimization
        }
    }
}
