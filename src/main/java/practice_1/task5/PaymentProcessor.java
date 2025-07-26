package practice_1.task5;

public class PaymentProcessor implements ProcessPay {

    @Override
    public void payTypeCreditCard(double amount) {
        System.out.println("Оплата кредитной картой на сумму " + amount);
    }

    @Override
    public void payTypePayPal(double amount) {
        System.out.println("Оплата через PayPal на сумму " + amount);
    }

    @Override
    public void payTypeBitcoin(double amount) {
        System.out.println("Оплата Bitcoin на сумму " + amount);
    }
}
