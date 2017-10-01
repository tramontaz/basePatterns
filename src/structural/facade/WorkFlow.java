package structural.facade;

class WorkFlow {
    private Job job = new Job();
    private BugTracker bugTracker = new BugTracker();
    private Developer developer = new Developer();

    void solveProblems() {
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
