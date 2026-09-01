public class Ejercicio7 {

    public static void main(String[] args) {

        Document document =
                new Document();

        document.approve();

        DocumentHandler author =
                new AuthorHandler();

        DocumentHandler leader =
                new LeaderHandler();

        DocumentHandler legal =
                new LegalHandler();

        author.setNext(leader);
        leader.setNext(legal);

        author.handle(document);

        System.out.println(
                "Estado final: "
                        + document.getState()
        );
    }
}