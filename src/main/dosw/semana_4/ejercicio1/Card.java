public class Card implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
        System.out.println("Pago realizado con Tarjeta por $" + amount);
    }
}