package practice_2.task12;

public class Main {
    public static void main(String[] args) {
        ControlServicesFacade service = new ControlServicesFacade();

        service.forceOnConditioner();
        service.forceOffConditioner();

        System.out.println("-----------------------------------");

        service.forceOnLight();
        service.forceOffLight();

        System.out.println("-----------------------------------");

        service.forceOnSecuritySystem();
        service.forceOffSecuritySystem();
    }
}
