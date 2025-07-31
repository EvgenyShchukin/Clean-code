package practice_2.task7;

import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {
    private List<String> products = new ArrayList<>();
    private double discount = 0.0;
    private String payType = null;

    public OrderBuilder addProducts(String product) {
        products.add(product);
        return this;
    }

    public OrderBuilder applyDiscount(double discount) {
        this.discount = discount;
        return this;
    }

    public OrderBuilder payType(String payType) {
        this.payType = payType;
        return this;
    }

    public Order build() {
        return new Order(products, discount, payType);
    }
}
