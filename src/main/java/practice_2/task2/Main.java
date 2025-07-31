package practice_2.task2;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance("C:\\Java\\Clean-code\\src\\main\\java\\practice_2\\task2\\1.txt", LogLevel.ERROR);
//        Logger logger = Logger.getInstance(null, LogLevel.ERROR);

        logger.info("Сообщение с типом INFO");
        logger.warn("Сообщение с типом WARN");
        logger.error("Сообщение с типом ERROR");
    }
}
