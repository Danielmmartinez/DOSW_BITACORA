public class Nequi implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
        System.out.println("Pago realizado con Nequi por $" + amount);
    }
}