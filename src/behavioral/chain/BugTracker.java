package behavioral.chain;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTIN);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("everything is ok", Priority.ROUTIN);
        reportNotifier.notifyManager("something went wrong!", Priority.IMPORTANT);
        reportNotifier.notifyManager("Huston, we've got a problem", Priority.ASAP);
    }
}
