import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Item> items = List.of(
                new Item("Food", 2.5),
                new Item("Electronics", 199.99),
                new Item("Food", 1.2),
                new Item("Clothes", 49.99)
        );

        Map<String, List<Item>> grouped = items.stream()
                .collect(Collectors.groupingBy(Item::getCategory));

        System.out.println(grouped);

    }
}