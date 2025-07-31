package practice_2.task10;

public class Miles implements Distance{
    private double miles;

    public Miles(double miles) {
        this.miles = miles;
    }

    @Override
    public double getDistance() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }
}
