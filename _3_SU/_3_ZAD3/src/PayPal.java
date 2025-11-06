public class PayPal extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment with PayPal: " + amount + " lv.");
    }
}