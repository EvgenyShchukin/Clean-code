package practice_2.task3;

public class BicycleFactory extends TransportFactory {
    @Override
    Transport createTransport() {
        return new Bicycle();
    }
}
