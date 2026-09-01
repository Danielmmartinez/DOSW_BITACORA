public class LegacyBankAdapter
        implements PaymentProcessor {

    private LegacyBankService legacy;

    public LegacyBankAdapter(
            LegacyBankService legacy) {

        this.legacy = legacy;
    }

    @Override
    public void pay(double amount) {

        int cents =
                (int) (amount * 100);

        legacy.executeTransaction(
                "ACC001",
                cents
        );
    }
}
