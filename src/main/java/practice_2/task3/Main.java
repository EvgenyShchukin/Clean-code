package practice_2.task3;

public class Main {
    public static void main(String[] args) {
        TransportFactory transport;

        String transportType = "car";

        if ("car".equals(transportType)) {
            transport = new CarFactory();
        } else {
            transport = new BicycleFactory();
        }

        transport.forceDrive();
    }
}
