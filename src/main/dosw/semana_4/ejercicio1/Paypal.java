public class Paypal implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
        System.out.println("Pago realizado con PayPal por $" + amount);
    }
}