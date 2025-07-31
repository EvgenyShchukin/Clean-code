package practice_2.task6;

public class Main {
    public static void main(String[] args) {
        GUIFactory guiFactory;

        String osType = "MacOs";

        if ("Windows".equalsIgnoreCase(osType)) {
            guiFactory = new WindowsFactory();
        } else {
            guiFactory = new MacFactory();
        }

        guiFactory.createButton().click();
        guiFactory.createMenu().draw();
        guiFactory.createWindow().draw();
    }
}
