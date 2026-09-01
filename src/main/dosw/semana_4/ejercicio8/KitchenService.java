public class KitchenService
        implements OrderObserver {

    @Override
    public void update(Order order) {

        System.out.println(
                "Cocina: Preparar pedido"
        );
    }
}