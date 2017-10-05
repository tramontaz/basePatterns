package behavioral.chain;

public class EmailNotifier extends Notifier {

    EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying use email notifier: " + message);
    }
}
