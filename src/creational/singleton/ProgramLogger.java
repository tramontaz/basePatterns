package creational.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "This is a log file:\n\n";

    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }

        return programLogger;
    }

    private ProgramLogger() {

    }

    public void showLog(){
        System.out.println(logFile);
    }

    public void setLogFile(String logInfo) {
        logFile += logInfo + "\n";
    }
}
