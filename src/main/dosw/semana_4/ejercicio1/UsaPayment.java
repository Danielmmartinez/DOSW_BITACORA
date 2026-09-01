public class UsaPayment implements PaymentFactory {

    @Override
    public PaymentStrategy createPayment(String type) {

        switch (type.toUpperCase()) {

            case "PAYPAL":
                return new Paypal();

            case "CARD":
                return new Card();

            default:
                throw new IllegalArgumentException("Método no soportado");
        }
    }
}