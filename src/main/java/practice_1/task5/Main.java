package practice_1.task5;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.payTypeCreditCard(100);
        processor.payTypePayPal(200);
        processor.payTypeBitcoin(300);

    }
}
