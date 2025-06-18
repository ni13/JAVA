package Set;

import java.util.TreeSet;

public class AutoComplete {
    public static void main(String[] args) {
        TreeSet<String> dictionary = new TreeSet<>();

        dictionary.add("apple");
        dictionary.add("banana");
        dictionary.add("apricot");
        dictionary.add("banana"); // duplicate

        for (String word : dictionary) {
            System.out.println("Word: " + word);
        }
    }
}
