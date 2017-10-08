package behavioral.command;

public class Developer {
    private Command insert;
    private Command update;
    private Command select;
    private Command delete;

    public Developer(Command insert, Command update, Command select, Command delete) {
        this.insert = insert;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }

    void insertCommand() {
        insert.execute();
    }

    void updateCommand() {
        update.execute();
    }

    void selectCommand() {
        select.execute();
    }

    void deleteCommand() {
        delete.execute();
    }
}