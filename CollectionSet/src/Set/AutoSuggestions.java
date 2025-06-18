package Set;

import java.util.LinkedHashSet;

public class AutoSuggestions {
    public static void main(String[] args) {
        LinkedHashSet<String> suggestions = new LinkedHashSet<>();

        suggestions.add("Java");
        suggestions.add("JavaScript");
        suggestions.add("Java"); // duplicate
        suggestions.add("Python");

        for (String term : suggestions) {
            System.out.println("Suggested: " + term);
        }
    }
}
