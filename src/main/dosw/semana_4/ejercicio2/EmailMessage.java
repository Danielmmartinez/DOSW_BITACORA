package ejercicio02;
public class EmailMessage implements MessageFactory {

    @Override
    public Message createMessage(String status) {
        return new Message(
                "<html>Estado actualizado: " + status + "</html>"
        );
    }
}