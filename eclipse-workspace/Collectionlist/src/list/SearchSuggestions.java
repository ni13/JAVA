package list;

import java.util.ArrayList;

public class SearchSuggestions {
    public static void main(String[] args) {
        ArrayList<String> suggestions = new ArrayList<>();
        suggestions.add("Shoes");
        suggestions.add("Shirts");
        suggestions.add("Shorts");

        for (String item : suggestions) {
            System.out.println(item);
        }
    }
}
