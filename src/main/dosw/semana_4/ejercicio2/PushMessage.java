package ejercicio02;
public class PushMessage implements MessageFactory {

    @Override
    public Message createMessage(String status) {
        return new Message(
                "{\"status\":\"" + status + "\"}"
        );
    }
}