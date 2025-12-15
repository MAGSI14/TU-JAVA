import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 1, 2, 3, 5, 3, 6, 6, 6, 2);

        List<Integer> noDuplicates = nums.stream()
                .distinct()
                .toList();

        System.out.println(noDuplicates);
    }
}
