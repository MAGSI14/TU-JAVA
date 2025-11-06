import java.util.*;
public class Main {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
            sum+=arr[i];
        }
        System.out.println("Sredoaritmetichno = " + sum/5);
    }
}