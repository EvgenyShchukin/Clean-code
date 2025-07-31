package practice_2.task9;

public class DOCProcessor implements DocumentProcessor{
    @Override
    public void process(String fileName) {
        System.out.println("Обработка doc файла " + fileName);
    }
}
