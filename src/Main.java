/*
----Factory tasarım deseni birbirleri ile ilişkili nesneleri oluşturmak için bir arayüz sağlar ve alt sınıfların hangi sınıfın
örneğini oluşturacağına olanak sağlar.

----Buradaki amaç istemci tarafından birbirleri ile ilişkili nesnelerin oluşturulma anını soyutlamak, istemci hangi sınıf
örneğini alabileceğini bilebilir ama oluşturulma detayları bilmez. Detaylar yani nesnenin nasıl oluşturulacağı soyutlanır.
Örneğin oluşturulan sınıfın Singleton olarak oluşturulması gibi.
 */
public class Main {
    public static void main(String[] args) {
        NotifyFactory notifyFactory = new NotifyFactory();

        INotify notify = notifyFactory.CreateNotify("SMS");

        notify.sendNotification(new User());
    }
}