public class Document {

    private DocumentState state;

    public Document() {
        state = new DraftState();
    }

    public void setState(DocumentState state) {
        this.state = state;
    }

    public void approve() {
        state.approve(this);
    }

    public void reject() {
        state.reject(this);
    }

    public String getState() {
        return state.getName();
    }
}