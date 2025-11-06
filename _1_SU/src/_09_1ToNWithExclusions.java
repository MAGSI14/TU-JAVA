import java.util.*;
public class _09_1ToNWithExclusions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i % 3 != 0 && i % 7 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
