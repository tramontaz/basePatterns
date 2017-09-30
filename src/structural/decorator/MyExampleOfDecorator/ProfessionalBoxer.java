package structural.decorator.MyExampleOfDecorator;

public class ProfessionalBoxer extends BoxerDecorator {
    ProfessionalBoxer(Boxer boxer) {
        super(boxer);
    }

    private String beatUppercut() {
        return "\tBeats the uppercut.";
    }

    @Override
    public String boxing() {
        return super.boxing() + beatUppercut();
    }
}
