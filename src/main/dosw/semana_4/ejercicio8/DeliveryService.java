public class DeliveryService
        implements OrderObserver {

    @Override
    public void update(Order order) {

        System.out.println(
                "Domicilio: Preparar ruta"
        );
    }
}