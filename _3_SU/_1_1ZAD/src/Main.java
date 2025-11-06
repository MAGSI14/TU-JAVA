public class Main {
    public static void main(String[] args) {
        Message msg = MessageFactory.createMessage("email");
        msg.send();
    }
}