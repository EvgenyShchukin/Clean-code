package practice_2.task9;

public class PDFProcessor implements DocumentProcessor{
    @Override
    public void process(String fileName) {
        System.out.println("Обработка pdf файла " + fileName);
    }
}
