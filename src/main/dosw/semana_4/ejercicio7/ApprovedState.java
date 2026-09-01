public class ApprovedState implements DocumentState {

    @Override
    public void approve(Document document) {

        System.out.println(
                "Ya está aprobado"
        );
    }

    @Override
    public void reject(Document document) {

        System.out.println(
                "No puede rechazarse"
        );
    }

    @Override
    public String getName() {
        return "APROBADO";
    }
}