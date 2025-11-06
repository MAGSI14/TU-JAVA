import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        int sum  = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            sum+=arr[i];
        }
        System.out.println("The sum of the nums is "+ sum);
    }
}