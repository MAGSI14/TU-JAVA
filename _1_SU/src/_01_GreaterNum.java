import java.util.*;
public class _01_GreaterNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number a = ");
        int a = scanner.nextInt();
        System.out.print("Enter number b = ");
        int b = scanner.nextInt();
        if(a>b){
            System.out.printf("The bigger num is %d%n", a);
        } else {
            System.out.printf("The bigger num is %d%n", b);
        }
    }
}