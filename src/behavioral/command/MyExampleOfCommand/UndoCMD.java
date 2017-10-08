package behavioral.command.MyExampleOfCommand;

public class UndoCMD implements CMD {
    private CommandLine commandLine;

    UndoCMD(CommandLine commandLine) {
        this.commandLine = commandLine;
    }

    @Override
    public void execute() {
        commandLine.undo();
    }
}
