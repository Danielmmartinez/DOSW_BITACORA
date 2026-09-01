public class SuggestedList
        implements PreferenceObserver {

    @Override
    public void update(
            RecommendationStrategy strategy) {

        System.out.println(
                "SUGERIDOS: "
                        + strategy.recommend()
        );
    }
}