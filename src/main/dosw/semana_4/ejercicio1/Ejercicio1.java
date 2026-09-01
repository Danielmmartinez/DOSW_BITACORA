public class Ejercicio1 {

    public static void main(String[] args) {

        PaymentFactory colombiaFactory =
                new ColombiaPayment();

        PaymentStrategy strategy =
                colombiaFactory.createPayment("NEQUI");

        Checkout checkout = new Checkout(strategy);

        checkout.pay(150000);

        PaymentFactory usaFactory =
                new UsaPayment();

        PaymentStrategy paypal =
                usaFactory.createPayment("PAYPAL");

        new Checkout(paypal).pay(250);
    }
}