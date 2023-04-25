// UML diyagramındaki ConcreteProduct sınıflarına denk gelmektedir.
public class SmsNotify implements INotify {


    @Override
    public void sendNotification(User user) {
        // // SMS gönderme operasyonu.
        System.out.println("SMS Gönderildi.");
    }
}
