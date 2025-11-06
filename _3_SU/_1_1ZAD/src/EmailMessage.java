public class EmailMessage implements Message{

    @Override
    public void send() {
        System.out.println("Email has been sent!");
    }
}
