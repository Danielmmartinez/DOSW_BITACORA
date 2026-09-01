package ejercicio02;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<NotificationObserver> observers =
            new ArrayList<>();

    private String status;

    public void addObserver(
            NotificationObserver observer) {

        observers.add(observer);
    }

    public void changeStatus(String status) {

        this.status = status;

        notifyObservers();
    }

    private void notifyObservers() {

        for (NotificationObserver observer : observers) {
            observer.update(status);
        }
    }
}
