public class Ejercicio6 {

    public static void main(String[] args) {

        UserProfile profile =
                new UserProfile();

        profile.addObserver(
                new HomePage());

        profile.addObserver(
                new NotificationService());

        profile.addObserver(
                new SuggestedList());

        profile.setStrategy(
                new GenreStrategy());

        System.out.println();

        profile.setStrategy(
                new PopularityStrategy());
    }
}