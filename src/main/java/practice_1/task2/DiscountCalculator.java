package practice_1.task2;

public class DiscountCalculator {
    public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
        double discount = 0.0;

        if (isLoyalCustomer && isFirstPurchase) {
            discount = price * 0.10;
        }

        if (isLoyalCustomer && !isFirstPurchase) {
            discount = price * 0.05;
        }

        if (!isLoyalCustomer && hasCoupon) {
            discount = price * 0.07;
        }

        if (!isLoyalCustomer && !hasCoupon) {
            discount = price * 0.02;
        }

        return price - discount;
    }
}
