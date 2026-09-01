public class LegacyBankService {

    public void executeTransaction(
            String account,
            int cents) {

        System.out.println(
                "Sistema Legacy procesó "
                        + cents
                        + " centavos."
        );
    }
}