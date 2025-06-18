package list;

import java.util.ArrayList;

public class RecentlyViewedMovies {
    public static void main(String[] args) {
        ArrayList<String> recentMovies = new ArrayList<>();
        recentMovies.add("Inception");
        recentMovies.add("Avatar");
        recentMovies.add("Titanic");

        recentMovies.remove("Avatar");
        recentMovies.add(1, "Avatar"); // Reordered

        for (String movie : recentMovies) {
            System.out.println(movie);
        }
    }
}
