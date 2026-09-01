public class LeaderHandler
        extends DocumentHandler {

    @Override
    public void handle(Document document) {

        System.out.println(
                "Revisión Líder OK"
        );

        if (next != null) {
            next.handle(document);
        }
    }
}