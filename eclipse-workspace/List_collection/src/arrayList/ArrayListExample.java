package arrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> songs = new ArrayList<>();
        songs.add("Song A");
        songs.add("Song B");
        songs.add("Song C");

        System.out.println("Second song: " + songs.get(1)); // Song B
    }
}