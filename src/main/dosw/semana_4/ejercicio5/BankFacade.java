public class BankFacade {

    private PaymentProcessor processor;

    public BankFacade() {

        LegacyBankService legacy =
                new LegacyBankService();

        processor =
                new LegacyBankAdapter(legacy);
    }

    public void processPayment(double amount) {

        System.out.println(
                "Abriendo conexión..."
        );

        System.out.println(
                "Validando sesión..."
        );

        processor.pay(amount);

        System.out.println(
                "Registrando transacción..."
        );

        System.out.println(
                "Cerrando conexión..."
        );
    }
}