package practice_2.task7;

import java.util.List;

public class Order {
    private List<String> products;
    private double discount;
    private String payType;

    public Order(List<String> products, double sale, String payType) {
        this.products = products;
        this.discount = sale;
        this.payType = payType;
    }

    public void displayOrder() {
        System.out.println("🛒 Заказ:");
        for (String product : products) {
            System.out.println(" - " + product);
        }
        System.out.println("Скидка: " + discount + "%");
        System.out.println("Способ оплаты: " + payType);
    }
}

