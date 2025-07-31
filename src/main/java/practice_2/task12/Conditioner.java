package practice_2.task12;

public class Conditioner implements ControlServices{
    @Override
    public void forceOn() {
        System.out.println("Кнопка включения кондиционера");
    }

    @Override
    public void forceOff() {
        System.out.println("Кнопка выключения кондиционера");
    }
}
