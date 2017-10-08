package behavioral.command.MyExampleOfCommand;

class Administrator {
    private CMD run;
    private CMD redo;
    private CMD undo;

    Administrator(CMD run, CMD redo, CMD undo) {
        this.run = run;
        this.redo = redo;
        this.undo = undo;
    }

    void runCommand() {
        run.execute();
    }

    void redoCommand() {
        redo.execute();
    }

    void undoCommand() {
        undo.execute();
    }
}
