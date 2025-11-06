import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            EventLog log = new EventLog();
            log.addEvent("User logged in");
            log.addEvent("User clicked a button");
            log.addEvent("User logged out");
            System.out.println("Current Event Log:");
            log.Print();
            List<String> eventList = new ArrayList<>();
            for (int i = 1; i <= 5; i++) {
                eventList.add("Event #" + i);
            }
            EventLog log2 = new EventLog(eventList);
            System.out.println("\nSecond Event Log:");
            log2.Print();
            for (int i = 0; i < 101; i++) {
                log.addEvent("Extra Event " + i);
            }

        } catch (TooManyEvents e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
