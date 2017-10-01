package structural.facade;

public class SprintRunner {
    public static void main(String[] args) {
//        Job job = new Job();
//        job.doJob();
//
//
//        BugTracker bugTracker = new BugTracker();
//        bugTracker.finishSprint();
//
//        Developer developer = new Developer();
//        developer.doJobBeforeDeadline(bugTracker);
        WorkFlow workFlow = new WorkFlow();
        workFlow.solveProblems();
    }

}
