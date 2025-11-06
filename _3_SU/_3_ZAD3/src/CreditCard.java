public class CreditCard extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment with credit card: " + amount + " lv.");
    }
}