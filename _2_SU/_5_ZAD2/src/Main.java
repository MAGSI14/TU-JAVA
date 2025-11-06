import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] words = {"dinosaur", "purple", "vehicle", "car", "smile"};

        Arrays.sort(words, Comparator.comparingInt(String::length));

        System.out.println("Сортирани по дължина: " + Arrays.toString(words));
    }
}