package practice_2.task1;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        ConfigurationManager config2 = ConfigurationManager.getInstance();

        config1.setLevelLog("WARN");
        config1.setLevelLog("ERROR");

        config1.displayConfig();
        config2.displayConfig();
    }
}
