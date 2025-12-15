import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 5, 8, 12, 3, 6);

        List<Integer> even = list.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(even);
    }
}
