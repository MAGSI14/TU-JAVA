import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 1, 9, 3, 7);

        List<Integer> sortedDesc = nums.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(sortedDesc);
    }
}
