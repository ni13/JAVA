package list;

import java.util.LinkedList;

public class PlaylistManager {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");

        playlist.remove("Song B");
        playlist.add(1, "Song B"); // Reordering

        for (String song : playlist) {
            System.out.println(song);
        }
    }
}
