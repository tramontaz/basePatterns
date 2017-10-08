package behavioral.command.MyExampleOfCommand;

public class RedoCMD implements CMD {
    private CommandLine commandLine;

    RedoCMD(CommandLine commandLine) {
        this.commandLine = commandLine;
    }

    @Override
    public void execute() {
        commandLine.redo();
    }
}
