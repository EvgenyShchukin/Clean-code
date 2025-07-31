package practice_2.task12;

public class Light implements ControlServices{
    @Override
    public void forceOn() {
        System.out.println("Кнопка включения света");
    }

    @Override
    public void forceOff() {
        System.out.println("Кнопка выключения свет");
    }
}
