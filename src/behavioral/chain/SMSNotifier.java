package behavioral.chain;

public class SMSNotifier extends Notifier {

    SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying use SMS: " + message);
    }
}
