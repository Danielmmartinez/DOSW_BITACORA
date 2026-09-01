public class Ejercicio9 {

    public static void main(String[] args) {

        Validator cred =
                new CredentialValidator();

        Validator perm =
                new PermissionValidator();

        Validator loc =
                new LocationValidator();

        cred.setNext(perm);
        perm.setNext(loc);

        AuthService service =
                new AuthService(
                        new PasswordStrategy());

        service.login(cred);
    }
}