// UML diyagramındaki ConcreteProduct sınıflarına denk gelmektedir.
public class MailNotify implements INotify{


    @Override
    public void sendNotification(User user) {
        //mail gönderme operasyonu

        System.out.println("Email Gönderildi.");
    }
}
