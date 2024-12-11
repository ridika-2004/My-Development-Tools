public class SMSNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("SMS sent to " + recipient + ": " + message);
    }
}
