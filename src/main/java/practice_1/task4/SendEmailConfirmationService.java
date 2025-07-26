package practice_1.task4;

public class SendEmailConfirmationService {
    private Order order;

    public SendEmailConfirmationService(Order order) {
        this.order = order;
    }

    public void sendEmailConfirmation(String email) {
        System.out.println("Отправляем письмо клиенту " + order.getEmail());
    }
}
