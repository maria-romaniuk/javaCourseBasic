package homeworks.homework21.encapsulation.task3;


//Разработайте класс SystemConfiguration, который хранит конфигурационные параметры системы (например, уровень
// логирования, путь к файлам логов). Доступ к изменению этих параметров должен быть строго контролируемым
// через методы, предотвращающие установку некорректных значений.


public class SystemConfiguration {
    private String logsLevel;
    private String logs;


    public SystemConfiguration(String logsLevel, String logs) {
        this.logsLevel = logsLevel;
        this.logs = logs;
    }

    public String getLogsLevel() {
        return logsLevel;
    }

    public String getLogs() {
        return logs;
    }

//    public void setLogs(String logs) {
//        this.logs = logs;
//    }
}
