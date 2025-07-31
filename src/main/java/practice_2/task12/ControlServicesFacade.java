package practice_2.task12;

public class ControlServicesFacade {
    private ControlServices conditioner;
    private ControlServices light;
    private ControlServices securitySystem;

    public ControlServicesFacade() {
        this.conditioner = new Conditioner();
        this.light = new Light();
        this.securitySystem = new SecuritySystem();
    }

    public void forceOnConditioner() {
        conditioner.forceOn();
        System.out.println("Кондиционер включен");
    }

    public void forceOffConditioner() {
        conditioner.forceOff();
        System.out.println("Кондиционер выключен");
    }

    public void forceOnLight() {
        conditioner.forceOn();
        System.out.println("Свет включен");
    }

    public void forceOffLight() {
        conditioner.forceOff();
        System.out.println("Свет выключен");
    }

    public void forceOnSecuritySystem() {
        conditioner.forceOn();
        System.out.println("Безопасность включена");
    }

    public void forceOffSecuritySystem() {
        conditioner.forceOff();
        System.out.println("Безопасность выключена");
    }
}
