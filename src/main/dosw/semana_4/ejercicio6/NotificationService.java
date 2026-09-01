public class NotificationService
        implements PreferenceObserver {

    @Override
    public void update(
            RecommendationStrategy strategy) {

        System.out.println(
                "NOTIFICACIÓN: "
                        + strategy.recommend()
        );
    }
}