public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        Application app1 = new Application(consoleLogger);
        app1.logInfo("Приложението стартира.");

        Logger fileLogger = new FileLogger();
        Application app2 = new Application(fileLogger);
        app2.logInfo("Запис в лог файл.");
    }
}