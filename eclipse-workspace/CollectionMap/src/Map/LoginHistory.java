package Map;

import java.util.LinkedHashMap;
import java.time.LocalDateTime;

public class LoginHistory {
    public static void main(String[] args) {
        LinkedHashMap<String, LocalDateTime> loginHistory = new LinkedHashMap<>();

        loginHistory.put("alice", LocalDateTime.now().minusHours(3));
        loginHistory.put("bob", LocalDateTime.now().minusHours(2));
        loginHistory.put("charlie", LocalDateTime.now());

        for (String user : loginHistory.keySet()) {
            System.out.println(user + " logged in at " + loginHistory.get(user));
        }
    }
}
