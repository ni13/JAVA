package Set;

import java.util.TreeSet;

public class GameLeaderboard {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(120);
        scores.add(95);
        scores.add(150);
        scores.add(95); // duplicate

        for (int score : scores.descendingSet()) {
            System.out.println("Score: " + score);
        }
    }
}
