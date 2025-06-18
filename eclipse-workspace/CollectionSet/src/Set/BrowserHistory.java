package Set;

import java.util.LinkedHashSet;

public class BrowserHistory {
    public static void main(String[] args) {
        LinkedHashSet<String> history = new LinkedHashSet<>();

        history.add("google.com");
        history.add("openai.com");
        history.add("google.com"); // won't be added again
        history.add("github.com");

        for (String url : history) {
            System.out.println("Visited: " + url);
        }
    }
}
