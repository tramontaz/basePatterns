package behavioral.command.MyExampleOfCommand;

public class RunCMD implements CMD {
    private CommandLine commandLine;

    RunCMD(CommandLine commandLine) {
        this.commandLine = commandLine;
    }

    @Override
    public void execute() {
        commandLine.run();
    }
}
