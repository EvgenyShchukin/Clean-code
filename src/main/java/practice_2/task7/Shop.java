package practice_2.task7;

public class Shop {
    public static void main(String[] args) {

        Order order = new OrderBuilder()
                .addProducts("Ноутбук")
                .addProducts("мышь")
                .applyDiscount(10)
                .payType("наличные")
                .build();

        order.displayOrder();
    }
}
