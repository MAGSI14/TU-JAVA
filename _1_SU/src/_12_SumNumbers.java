import java.util.*;
public class _12_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int N = scanner.nextInt();
        int num = 0;
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            System.out.printf("Enter %dth number: ", i);
            num = scanner.nextInt();
            sum+=num;
        }
        System.out.println("The sum of the numbers is " + sum);
    }
}
