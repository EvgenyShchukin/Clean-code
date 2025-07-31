package practice_2.task5;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory;
        String type = "classic";

        if ("classic".equalsIgnoreCase(type)) {
            furnitureFactory = new ClassicFurnitureFactory();
        } else {
            furnitureFactory = new ModernFurnitureFactory();
        }

        furnitureFactory.createChair().sitOn();
        furnitureFactory.createTable().use();
    }
}
