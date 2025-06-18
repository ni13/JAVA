package Map;

import java.util.Hashtable;

public class SharedConfig {
    public static void main(String[] args) {
        Hashtable<String, String> config = new Hashtable<>();
        config.put("url", "https://api.example.com");
        config.put("timeout", "30");
        config.put("retry", "3");

        System.out.println("Timeout: " + config.get("timeout"));
    }
}
