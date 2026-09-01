public class PasswordStrategy
        implements AuthStrategy {

    @Override
    public boolean authenticate() {

        System.out.println(
                "Autenticando con usuario y contraseña"
        );

        return true;
    }
}