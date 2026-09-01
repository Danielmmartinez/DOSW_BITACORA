package ejercicio02;
public class SmsMessage implements MessageFactory {

    @Override
    public Message createMessage(String status) {
        return new Message(
                "Pedido: " + status
        );
    }
}