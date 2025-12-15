import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "tree", "House", "cat", "River");

        List<String> filtered = words.stream()
                .filter(w -> w.length() > 4)
                .filter(w -> Character.isUpperCase(w.charAt(0)))
                .toList();

        System.out.println(filtered);
    }
}
