package practice_1.task4;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1, "test@test.ru", "111-222-333");

        ProcessOrderService processOrderService = new ProcessOrderService(order);
        processOrderService.processOrder(order.getNumber());

        SendEmailConfirmationService sendEmailConfirmationService = new SendEmailConfirmationService(order);
        sendEmailConfirmationService.sendEmailConfirmation(order.getEmail());

        GenerateInvoiceService generateInvoiceService = new GenerateInvoiceService(order);
        generateInvoiceService.generateInvoice(order.getInvoice());
    }
}
