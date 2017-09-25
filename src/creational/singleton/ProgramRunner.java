package creational.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().setLogFile("First log");
        ProgramLogger.getProgramLogger().setLogFile("Second log");
        ProgramLogger.getProgramLogger().setLogFile("Third log");

        ProgramLogger.getProgramLogger().showLog();
    }
}
