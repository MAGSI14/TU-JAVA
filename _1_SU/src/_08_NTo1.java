import java.util.*;
public class _08_NTo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int N = scanner.nextInt();
        for (int i = N; i >0 ; i--) {
            System.out.print(i + " ");
        }
    }
}
