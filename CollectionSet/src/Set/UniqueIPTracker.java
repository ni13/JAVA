package Set;

import java.util.HashSet;

public class UniqueIPTracker {
    public static void main(String[] args) {
        HashSet<String> uniqueIPs = new HashSet<>();

        uniqueIPs.add("192.168.0.1");
        uniqueIPs.add("10.0.0.5");
        uniqueIPs.add("192.168.0.1"); // duplicate, won't be added

        for (String ip : uniqueIPs) {
            System.out.println("IP: " + ip);
        }
    }
}
