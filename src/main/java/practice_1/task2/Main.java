package practice_1.task2;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator discountCalculator = new DiscountCalculator();

        System.out.println(discountCalculator.calculateDiscount(100, true, true, false));
        System.out.println(discountCalculator.calculateDiscount(100, true, false, false));
        System.out.println(discountCalculator.calculateDiscount(100, false, false, true));
        System.out.println(discountCalculator.calculateDiscount(100, false, false, false));
    }
}
