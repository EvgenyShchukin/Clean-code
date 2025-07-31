package practice_2.task10;

public class Kilometers implements Distance {
    private double kilometers;

    public Kilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    @Override
    public double getDistance() {
        return kilometers;
    }

    public void setKilometers(double kilometers) {
        this.kilometers = kilometers;
    }
}
