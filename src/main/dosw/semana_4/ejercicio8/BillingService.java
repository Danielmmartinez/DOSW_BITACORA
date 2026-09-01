public class BillingService
        implements OrderObserver {

    @Override
    public void update(Order order) {

        System.out.println(
                "Facturación: Generar cuenta"
        );
    }
}