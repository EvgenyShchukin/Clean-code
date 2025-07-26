package practice_1.task8;

public class EmailSender implements Consumer {
    @Override
    public void sendEmail(String message) {
        System.out.println("Отправка email: " + message);
    }
}
