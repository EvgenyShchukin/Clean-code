package practice_2.task3;

public class CarFactory extends TransportFactory {
    @Override
    Transport createTransport() {
        return new Car();
    }
}
