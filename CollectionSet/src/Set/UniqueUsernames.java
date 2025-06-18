package Set;

import java.util.HashSet;

public class UniqueUsernames {
    public static void main(String[] args) {
        HashSet<String> usernames = new HashSet<>();

        String newUser = "john_doe";
        if (usernames.add(newUser)) {
            System.out.println("User registered: " + newUser);
        } else {
            System.out.println("Username already exists.");
        }
    }
}
