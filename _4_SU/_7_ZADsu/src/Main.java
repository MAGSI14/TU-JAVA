import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = List.of(4, 8, 15, 16, 23, 42);

        double avg = nums.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println(avg); // 18.0
    }
}
