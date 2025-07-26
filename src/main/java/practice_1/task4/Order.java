package practice_1.task4;

public class Order {
    private int number;
    private String email;
    private String invoice;

    public Order(int number, String email, String invoice) {
        this.number = number;
        this.email = email;
        this.invoice = invoice;
    }

    public int getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }

    public String getInvoice() {
        return invoice;
    }
}
