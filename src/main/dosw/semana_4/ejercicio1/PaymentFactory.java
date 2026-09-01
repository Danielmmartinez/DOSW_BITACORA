public interface PaymentFactory {
    PaymentStrategy createPayment(String type);
}