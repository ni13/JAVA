package Sort;

public class LeaderBoard {
    public static void insertionSort(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            int key = scores[i];
            int j = i - 1;

            // Sort in descending order
            while (j >= 0 && scores[j] < key) {
                scores[j + 1] = scores[j];
                j--;
            }
            scores[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] scores = {1500, 1800, 1200, 2000, 1700};
        System.out.println("Before sorting:");
        for (int score : scores) System.out.print(score + " ");

        insertionSort(scores);

        System.out.println("\nAfter sorting (Leaderboard):");
        for (int score : scores) System.out.print(score + " ");
    }
}
