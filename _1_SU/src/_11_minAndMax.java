import java.util.*;
public class _11_minAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int n = scanner.nextInt();
        int num = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            System.out.printf("enter %dth number: ", i);
            num = scanner.nextInt();
            if (num < min) {
                min = num;
            }
            if(num>max){
                max = num;
            }
        }
        System.out.println("The smallest one is " + min);
        System.out.println("The biggest one is " + max);
    }
}
