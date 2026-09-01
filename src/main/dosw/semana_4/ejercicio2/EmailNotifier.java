package ejercicio02;
public class EmailNotifier implements NotificationObserver {

    private MessageFactory factory =
            new EmailMessage();

    @Override
    public void update(String status) {

        Message message =
                factory.createMessage(status);

        System.out.println(
                "EMAIL -> " + message.getContent()
        );
    }
}