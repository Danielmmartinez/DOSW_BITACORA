import java.util.List;

public class EjercicioPres5 {
    public static class Transaction {
        String id;
        double amount;
        boolean approved;

        public Transaction(String id, double amount, boolean approved) {
            this.id = id;
            this.amount = amount;
            this.approved = approved;
        }

        public boolean isApproved() { return approved; }

        @Override
        public String toString() {
            return "Transaction[id=" + id + ", amount=" + amount + ", approved=" + approved + "]";
        }
    }

    public static void main(String[] args) {
        List<Transaction> transactions = List.of(
                new Transaction("TX1", 100.0, true),
                new Transaction("TX2", 250.0, false),
                new Transaction("TX3", 50.0, true)
        );


        boolean isBatchValid = transactions.stream()
                .peek(t -> System.out.println("Procesando: " + t))
                .noneMatch(t -> !t.isApproved());

        System.out.println("¿Lote válido?: " + isBatchValid);
    }
}