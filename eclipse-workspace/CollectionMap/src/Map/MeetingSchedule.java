package Map;

import java.util.TreeMap;
import java.time.LocalTime;

public class MeetingSchedule {
    public static void main(String[] args) {
        TreeMap<LocalTime, String> schedule = new TreeMap<>();
        schedule.put(LocalTime.of(9, 0), "Team Standup");
        schedule.put(LocalTime.of(13, 0), "Client Call");
        schedule.put(LocalTime.of(11, 30), "Code Review");

        for (LocalTime time : schedule.keySet()) {
            System.out.println(time + " - " + schedule.get(time));
        }
    }
}
