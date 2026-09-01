public class DraftState implements DocumentState {

    @Override
    public void approve(Document document) {

        document.setState(new InReviewState());

        System.out.println(
                "Documento enviado a revisión"
        );
    }

    @Override
    public void reject(Document document) {

        System.out.println(
                "No puede rechazarse un borrador"
        );
    }

    @Override
    public String getName() {
        return "BORRADOR";
    }
}