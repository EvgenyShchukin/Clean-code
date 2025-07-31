package practice_2.task2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger logger;
    private PrintWriter writer;
    private final LogLevel logLevel;
    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private Logger(String logFilePath, LogLevel logLevel) {
        this.logLevel = logLevel;
        try {
            if (logFilePath == null || logFilePath.isEmpty()) {
                writer = new PrintWriter(System.out, true);
            } else {
                writer = new PrintWriter(new FileWriter(logFilePath, true), true);
            }
        } catch (IOException e) {
            System.err.println("Не удалось открыть файл лога для чтения " + e.getMessage());
            writer = new PrintWriter(System.out, true);
        }
    }

    public static Logger getInstance(String logFilePath, LogLevel logLevel) {
        if (logger == null) {
            logger = new Logger(logFilePath, logLevel);
        }
        return logger;
    }

    public void info(String message) {
        if (logLevel.compareTo(LogLevel.INFO) >= 0) {
            log("INFO", message);
        }
    }

    public void warn(String message) {
        if (logLevel.compareTo(LogLevel.WARN) >= 0) {
            log("WARN", message);
        }
    }

    public void error(String message) {
        if (logLevel.compareTo(LogLevel.ERROR) >= 0) {
            log("ERROR", message);
        }
    }

    private void log(String level, String message) {
        String timeStamp = LocalDateTime.now().format(dateTimeFormatter);
        writer.printf("[%s] [%s] %s%n", timeStamp, level, message);

    }
}
