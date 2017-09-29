package structural.adapter;

public class Runner {
    public static void main(String[] args) {
        Database database = new JavaApplicationAdapter();

        database.update();
        database.insert();
        database.select();
        database.remove();
    }
}
