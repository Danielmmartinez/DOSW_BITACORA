public class HomePage
        implements PreferenceObserver {

    @Override
    public void update(
            RecommendationStrategy strategy) {

        System.out.println(
                "HOME: "
                        + strategy.recommend()
        );
    }
}