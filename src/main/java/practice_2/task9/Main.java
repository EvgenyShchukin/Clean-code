package practice_2.task9;

public class Main {
    public static void main(String[] args) {
        String file1 = "report.doc";
        String file2 = "report.pdf";
        String file3 = "report.xml";

//        DocumentProcessor adapter1 = new DocumentAdapter(file1);
//        adapter1.process(file1);

        DocumentProcessor adapter2 = new DocumentAdapter(file2);
        adapter2.process(file2);

//        DocumentProcessor adapter3 = new DocumentAdapter(file3);
//        adapter2.process(file3);
    }
}
