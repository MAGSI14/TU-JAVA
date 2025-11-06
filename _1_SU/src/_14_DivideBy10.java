import java.util.*;
public class _14_DivideBy10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n(should be divisible by 10): ");
        int n = scanner.nextInt();
        while (n%10!=0){
            System.out.println("Error");
            System.out.println("Enter a number divisible by 10!");
            System.out.print("N = ");
            n = scanner.nextInt();
        }
    }
}
