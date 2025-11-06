import java.util.*;
public class _06_CheckIfValid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        if(n>=100 && n<=200){
            System.out.println("valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
