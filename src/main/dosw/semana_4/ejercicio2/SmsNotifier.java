package ejercicio02;
public class SmsNotifier implements NotificationObserver {

    private MessageFactory factory =
            new SmsMessage();

    @Override
    public void update(String status) {

        Message message =
                factory.createMessage(status);

        System.out.println(
                "SMS -> " + message.getContent()
        );
    }
}