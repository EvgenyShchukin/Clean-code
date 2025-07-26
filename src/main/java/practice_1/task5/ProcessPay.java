package practice_1.task5;

public interface ProcessPay {
    public void payTypeCreditCard(double amount);

    public void payTypePayPal(double amount);

    public void payTypeBitcoin(double amount);
}
