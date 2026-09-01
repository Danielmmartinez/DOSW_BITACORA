public class RejectedState implements DocumentState {

    @Override
    public void approve(Document document) {

        System.out.println(
                "No puede aprobarse"
        );
    }

    @Override
    public void reject(Document document) {

        System.out.println(
                "Ya está rechazado"
        );
    }

    @Override
    public String getName() {
        return "RECHAZADO";
    }
}