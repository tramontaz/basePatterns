package behavioral.command.MyExampleOfCommand;


public class AdminRunner {
    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine();

        Administrator administrator = new Administrator(
                new RunCMD(commandLine),
                new UndoCMD(commandLine),
                new RedoCMD(commandLine)
        );

        administrator.runCommand();
        administrator.redoCommand();
        administrator.undoCommand();
    }
}
