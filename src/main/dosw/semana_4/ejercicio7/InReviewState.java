public class InReviewState implements DocumentState {

    @Override
    public void approve(Document document) {

        document.setState(new ApprovedState());

        System.out.println(
                "Documento aprobado"
        );
    }

    @Override
    public void reject(Document document) {

        document.setState(new RejectedState());

        System.out.println(
                "Documento rechazado"
        );
    }

    @Override
    public String getName() {
        return "EN REVISION";
    }
}