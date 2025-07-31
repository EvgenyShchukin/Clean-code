package practice_2.task10;

public class Main {
    public static void main(String[] args) {
        Miles oldMiles = new Miles(10);

        Distance adapter = new MilesToKilometersAdapter(oldMiles);

        System.out.println(adapter.getDistance());
    }
}
