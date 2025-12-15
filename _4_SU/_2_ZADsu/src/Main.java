import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("ivan", "Maria", "pesho");

        List<String> upper = names.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(upper);
    }
}
