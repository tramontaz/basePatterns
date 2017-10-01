package structural.facade;

public class Developer {
    void doJobBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.activeSprint) {
            System.out.println("Developer is coding...");
        } else System.out.println("Developer is reading Habrahabr...");
    }
}
