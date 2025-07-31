package practice_2.task9;

public class DocumentAdapter implements DocumentProcessor {
    private DocumentProcessor documentProcessor;

    public DocumentAdapter(DocumentProcessor documentProcessor) {
        this.documentProcessor = documentProcessor;
    }

    public DocumentAdapter (String fileName) {
        if (fileName.endsWith(".pdf")) {
            System.out.println("Конвертация из pdf в doc");
            this.documentProcessor = new DOCProcessor();
        } else if (fileName.endsWith(".doc")) {
            this.documentProcessor = new DOCProcessor();
        } else {
            throw new UnsupportedOperationException("Неподдерживаемый формат файла " + fileName);
        }
    }

    @Override
    public void process(String fileName) {
        documentProcessor.process(fileName);
    }
}
