public class Pse implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
        System.out.println("Pago realizado con PSE por $" + amount);
    }
}
