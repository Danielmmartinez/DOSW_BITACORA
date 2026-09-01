public class Ejercicio8 {

    public static void main(String[] args) {

        Order order =
                new OrderBuilder()
                        .setSize("Grande")
                        .setMeat("Doble Carne")
                        .build();

        order.addObserver(
                new KitchenService());

        order.addObserver(
                new BillingService());

        order.addObserver(
                new DeliveryService());

        order.confirm();
    }
}