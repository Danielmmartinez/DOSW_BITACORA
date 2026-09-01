public class AuthorHandler
        extends DocumentHandler {

    @Override
    public void handle(Document document) {

        System.out.println(
                "Revisión Autor OK"
        );

        if (next != null) {
            next.handle(document);
        }
    }
}