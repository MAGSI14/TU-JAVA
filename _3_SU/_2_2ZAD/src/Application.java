public class Application {
    private Logger logger;

    public Application(Logger logger) {
        this.logger = logger;
    }
    public void logInfo(String message){
        logger.log("INFO: " + message);
    }
}
