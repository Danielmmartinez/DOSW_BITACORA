public class AuthService {

    private AuthStrategy strategy;

    public AuthService(
            AuthStrategy strategy) {

        this.strategy = strategy;
    }

    public void login(
            Validator validator) {

        if (strategy.authenticate()) {

            validator.validate();

            System.out.println(
                    "Acceso concedido"
            );
        }
    }
}