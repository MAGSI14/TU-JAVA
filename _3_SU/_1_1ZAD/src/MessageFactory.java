public class MessageFactory {
    public static Message createMessage(String message){
        switch (message.toLowerCase()) {
            case "email":
                return new EmailMessage();
            case "sms":
                return new SMSMessage();
            case "push":
                return new PushNotification();
        }
        return null;
    }
}
