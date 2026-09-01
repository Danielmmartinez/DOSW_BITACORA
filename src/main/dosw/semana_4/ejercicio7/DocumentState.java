public interface DocumentState {

    void approve(Document document);

    void reject(Document document);

    String getName();
}