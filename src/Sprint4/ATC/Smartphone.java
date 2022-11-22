package Sprint4.ATC;

// Допишите реализацию класса Smartphone
public class Smartphone extends MobilePhone {
    private static final String appName = "App";

    public Smartphone(String number) {
        super(number);
    }

    public final void sendEmail(String email, String messageText) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }

    public void makeCall(String targetNumber, String appName) {
        System.out.println("Позвоним через приложение " + appName + " по номеру " + targetNumber);
    }
}

