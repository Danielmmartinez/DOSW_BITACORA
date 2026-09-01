import java.util.ArrayList;
import java.util.List;

public class Order {

    private String size;
    private String meat;

    private List<OrderObserver> observers =
            new ArrayList<>();

    public Order(
            String size,
            String meat) {

        this.size = size;
        this.meat = meat;
    }

    public void addObserver(
            OrderObserver observer) {

        observers.add(observer);
    }

    public void confirm() {

        System.out.println(
                "Pedido confirmado"
        );

        for (OrderObserver observer :
                observers) {

            observer.update(this);
        }
    }
}