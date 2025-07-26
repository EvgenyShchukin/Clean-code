package practice_1.task4;

public class GenerateInvoiceService {
    private Order order;

    public GenerateInvoiceService(Order order) {
        this.order = order;
    }

    public void generateInvoice(String invoice) {
        System.out.println("Генерируем счет " + order.getInvoice());
    }
}
