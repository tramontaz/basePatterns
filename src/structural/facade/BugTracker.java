package structural.facade;

public class BugTracker {
    boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    void startSprint(){
        System.out.println("Sprint started.");
        activeSprint = true;
    }

    void finishSprint(){
        System.out.println("Sprint finished.");
    }
}
