import java.util.ArrayList;
import java.util.List;

public class UserProfile {

    private RecommendationStrategy strategy;

    private List<PreferenceObserver> observers =
            new ArrayList<>();

    public void addObserver(
            PreferenceObserver observer) {

        observers.add(observer);
    }

    public void setStrategy(
            RecommendationStrategy strategy) {

        this.strategy = strategy;

        notifyObservers();
    }

    private void notifyObservers() {

        for (PreferenceObserver observer :
                observers) {

            observer.update(strategy);
        }
    }
}