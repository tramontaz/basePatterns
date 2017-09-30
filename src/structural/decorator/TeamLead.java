package structural.decorator;

public class TeamLead extends DeveloperDecorator {

    TeamLead(Developer developer) {
        super(developer);
    }

    private String sendWeekReport(){
        return "Send week report to customer.\t";
    }

    @Override
    public String doJob() {
        return super.doJob() + sendWeekReport();
    }
}
