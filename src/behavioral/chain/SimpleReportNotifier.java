package behavioral.chain;

public class SimpleReportNotifier extends Notifier {

    SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying use system report: " + message);
    }
}
