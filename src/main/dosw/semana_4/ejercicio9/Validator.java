public abstract class Validator {

    protected Validator next;

    public void setNext(
            Validator next) {

        this.next = next;
    }

    public void validate() {

        process();

        if (next != null) {
            next.validate();
        }
    }

    protected abstract void process();
}