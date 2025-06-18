package Sort;

public class CardSorting {
    public static void insertionSort(int[] hand) {
        for (int i = 1; i < hand.length; i++) {
            int key = hand[i];
            int j = i - 1;

            // Move elements that are greater than key
            while (j >= 0 && hand[j] > key) {
                hand[j + 1] = hand[j];
                j--;
            }
            hand[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] hand = {7, 2, 9, 4, 1};
        System.out.println("Before sorting:");
        for (int card : hand) System.out.print(card + " ");

        insertionSort(hand);

        System.out.println("\nAfter sorting:");
        for (int card : hand) System.out.print(card + " ");
    }
}
