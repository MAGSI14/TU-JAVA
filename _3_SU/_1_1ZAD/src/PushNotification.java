public class PushNotification implements Message{

    @Override
    public void send() {
        System.out.println("Push notification has been sent!");
    }
}
