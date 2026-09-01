public abstract class DocumentHandler {

    protected DocumentHandler next;

    public void setNext(
            DocumentHandler next) {

        this.next = next;
    }

    public abstract void handle(
            Document document);
}