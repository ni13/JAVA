package Map;

import java.util.Hashtable;

public class SessionManager {
    public static void main(String[] args) {
        Hashtable<Integer, String> sessions = new Hashtable<>();
        sessions.put(101, "token_A1B2C3");
        sessions.put(102, "token_XYZ123");
        sessions.put(103, "token_QWE789");

        System.out.println("Session for User 102: " + sessions.get(102));
    }
}
