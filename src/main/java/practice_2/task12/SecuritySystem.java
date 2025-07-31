package practice_2.task12;

public class SecuritySystem implements ControlServices{
    @Override
    public void forceOn() {
        System.out.println("Кнопка включения системы безопасности");
    }

    @Override
    public void forceOff() {
        System.out.println("Кнопка выключения системы безопасности");
    }
}
