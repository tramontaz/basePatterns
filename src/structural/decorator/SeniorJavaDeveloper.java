package structural.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {

    SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    private String makeCodeReview(){
        return "Make code review.\t";
    }

    @Override
    public String doJob() {
        return super.doJob() + makeCodeReview();
    }
}
