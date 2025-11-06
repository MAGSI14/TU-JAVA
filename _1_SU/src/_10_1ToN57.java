import java.util.*;
public class _10_1ToN57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
