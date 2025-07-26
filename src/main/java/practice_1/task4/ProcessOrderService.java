package practice_1.task4;

public class ProcessOrderService {
    private Order order;

    public ProcessOrderService(Order order) {
        this.order = order;
    }

    public void processOrder(int number) {
        System.out.println("Обрабатываем заказ " + order.getNumber());
    }
}
