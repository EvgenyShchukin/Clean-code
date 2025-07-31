package practice_2.task1;

public class ConfigurationManager {
    private static ConfigurationManager configurationManager;
    private String dbUrl;
    private String dbLogin;
    private String dbPassword;
    private String fileStoragePath;
    private String levelLog;
    private String logPath;

    private ConfigurationManager(String dbUrl, String dbPassword, String dbLogin, String fileStoragePath, String levelLog, String logPath) {
        this.dbUrl = dbUrl;
        this.dbPassword = dbPassword;
        this.dbLogin = dbLogin;
        this.fileStoragePath = fileStoragePath;
        this.levelLog = levelLog;
        this.logPath = logPath;
    }

    public void setLevelLog(String levelLog) {
        this.levelLog = levelLog;
    }

    public static ConfigurationManager getInstance() {
        if (configurationManager == null) {
            configurationManager = new ConfigurationManager("//test/db", "qwerty", "admin", "//temp/storage", "INFO", "//logs");
        }

        return configurationManager;
    }

    public void displayConfig() {
        System.out.println("Путь к БД: " + dbUrl +
                "\n Путь к файлу: " + fileStoragePath +
                "\n Уровень логирования: " + levelLog +
                "\n Путь к файлу логирования: " + logPath
        );
    }
}
