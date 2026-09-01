public class Ejercicio5 {

    public static void main(String[] args) {

        BankFacade facade =
                new BankFacade();

        facade.processPayment(1500.50);
    }
}