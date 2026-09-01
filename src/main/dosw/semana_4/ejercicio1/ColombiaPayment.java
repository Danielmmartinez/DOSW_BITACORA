public class ColombiaPayment implements PaymentFactory {

    @Override
    public PaymentStrategy createPayment(String type) {

        switch (type.toUpperCase()) {

            case "PSE":
                return new Pse();

            case "NEQUI":
                return new Nequi();

            case "CARD":
                return new Card();

            default:
                throw new IllegalArgumentException("Método no soportado");
        }
    }
}