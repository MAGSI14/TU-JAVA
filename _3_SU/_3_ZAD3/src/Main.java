import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose payment method: (1) Credit Card, (2) PayPal");
        int choice = scanner.nextInt();

        PaymentMethod method;

        if (choice == 1) {
            method = new CreditCard();
        } else {
            method = new PayPal();
        }

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        method.processPayment(amount);

        scanner.close();
    }
}