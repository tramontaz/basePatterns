package structural.adapter;

public class JavaApplicationAdapter extends JavaApplication implements Database {
    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
