package behavioral.command.MyExampleOfCommand;

class CommandLine {
    void run() {
        System.out.println("Running command...");
    }

    void undo() {
        System.out.println("undo command...");
    }

    void redo() {
        System.out.println("redo command...");
    }
}
