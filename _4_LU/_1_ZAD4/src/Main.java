import java.util.*;
public class Main {
    public static void main(String[] args) {
        try {
            CCourse ENG = new CCourse("English");
            ENG.addStudent("Mariya Minova", "12345");
            ENG.addStudent("Nadya Damyanova", "12346");
            ENG.addScore("12345", 5.50);
            ENG.addScores("12346", Arrays.asList(6.0, 5.0, 5.5));
            ENG.displayScores();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Have a nice day!");
        }
    }
}