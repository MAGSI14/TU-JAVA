import java.util.*;
public class _05_CheckBounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        if(number >=-100 && number<=100 && number!=0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
