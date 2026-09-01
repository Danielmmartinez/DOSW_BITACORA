package ejercicio02;
public class PushNotifier implements NotificationObserver {

    private MessageFactory factory =
            new PushMessage();

    @Override
    public void update(String status) {

        Message message =
                factory.createMessage(status);

        System.out.println(
                "PUSH -> " + message.getContent()
        );
    }
}