public class LegalHandler
        extends DocumentHandler {

    @Override
    public void handle(Document document) {

        System.out.println(
                "Revisión Jurídica OK"
        );

        document.approve();
    }
}