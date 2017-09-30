package structural.decorator;

public class DeveloperDecorator implements Developer {
    private Developer developer;

    DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String doJob() {
        return developer.doJob();
    }
}
