package practice_2.task3;

public abstract class TransportFactory {
    abstract Transport createTransport();

    public void forceDrive() {
        Transport transport = createTransport();
        transport.drive();
    }
}
